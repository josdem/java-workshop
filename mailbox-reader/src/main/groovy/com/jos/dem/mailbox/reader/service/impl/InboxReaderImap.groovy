package com.jos.dem.mailbox.reader.service.impl

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.annotation.Autowired

import javax.mail.Folder
import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.NoSuchProviderException
import javax.mail.Session
import javax.mail.Store
import javax.annotation.PostConstruct

import com.jos.dem.mailbox.reader.service.InboxReader

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class InboxReaderImap implements InboxReader {

	@Value('${username}')
	String username
	@Value('${password}')
	String password
	@Value('${imap.server}')
	String server
	@Value('${imap.port}')
	String port

	Properties properties = new Properties()
	Folder sentFolder
	Store store

	Logger log = LoggerFactory.getLogger(this.class)
	
	@PostConstruct
	void setup() {
		properties.put("mail.imap.host", server);
		properties.put("mail.imap.port", port);
		properties.put("mail.store.protocol", "imaps");
		Session emailSession = Session.getDefaultInstance(properties)
		Store store = emailSession.getStore('imaps')
		store.connect(server, username, password)
		sentFolder = store.getFolder('[Gmail]/Sent Mail')
		sentFolder.open(Folder.READ_ONLY)
		log.info "Inbox Type: ${sentFolder.getType()}"
		log.info "Folders: ${store.getDefaultFolder().list('*')}"
	}

	void read(){
		Message[] messages = sentFolder.getMessages();
		log.info("messages.length---" + messages.length);

		for (int i = 0; i < messages.length; i++) {
			Message message = messages[i];
			log.info("--------------------------------")
			log.info("Email Number " + (i + 1))
			log.info("From: " + message.getFrom()[0])
			log.info("Subject: " + message.getSubject())
		}
		sentFolder.close(false)
	}
	
}