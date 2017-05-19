package com.jos.dem.mailbox.reader.service.impl

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.annotation.Autowired

import javax.mail.Folder
import javax.mail.Message
import javax.mail.Session
import javax.mail.Store
import javax.annotation.PostConstruct

import com.jos.dem.mailbox.reader.service.InboxReader

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class InboxReaderPop3 implements InboxReader {

	@Value('${username}')
	String username
	@Value('${password}')
	String password
	@Value('${pop3.server}')
	String server
	@Value('${pop3.port}')
	String port

	Properties properties = new Properties()
	Folder emailFolder
	Store store

	Logger log = LoggerFactory.getLogger(this.class)
	
	@PostConstruct
	void setup() {
		properties.put('mail.pop3.host', server)
		properties.put('mail.pop3.port', port)
		properties.put('mail.pop3.starttls.enable', 'true')
		Session emailSession = Session.getDefaultInstance(properties)
		Store store = emailSession.getStore('pop3s')
		store.connect(server, username, password)
		emailFolder = store.getFolder('INBOX')
		emailFolder.open(Folder.HOLDS_FOLDERS)
		log.info "Inbox Type: ${emailFolder.getType()}"
	}

	void read(){
		Message[] messages = emailFolder.getMessages()
		log.info "Messages Length: ${messages.length}"

		for (int i = 0; i < messages.length; i++) {
			Message message = messages[i]
			log.info '--------------------------------'
			log.info "Email Number ${(i + 1)}"
			log.info "From: ${message.getFrom()[0]}" 
			log.info "Subject: ${message.getSubject()}"
		}
		emailFolder.close(false)
	}
	
}