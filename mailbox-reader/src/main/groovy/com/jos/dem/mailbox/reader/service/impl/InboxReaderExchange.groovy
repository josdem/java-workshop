package com.jos.dem.mailbox.reader.service.impl

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.annotation.Autowired

import microsoft.exchange.webservices.data.core.ExchangeService
import microsoft.exchange.webservices.data.core.PropertySet
import microsoft.exchange.webservices.data.core.service.item.Item
import microsoft.exchange.webservices.data.core.service.folder.Folder
import microsoft.exchange.webservices.data.core.service.item.EmailMessage
import microsoft.exchange.webservices.data.credential.WebCredentials
import microsoft.exchange.webservices.data.credential.ExchangeCredentials
import microsoft.exchange.webservices.data.misc.ImpersonatedUserId
import microsoft.exchange.webservices.data.search.ItemView
import microsoft.exchange.webservices.data.search.FindItemsResults
import microsoft.exchange.webservices.data.property.complex.Mailbox
import microsoft.exchange.webservices.data.property.complex.FolderId
import microsoft.exchange.webservices.data.core.enumeration.misc.ConnectingIdType
import microsoft.exchange.webservices.data.autodiscover.IAutodiscoverRedirectionUrl
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName

import javax.annotation.PostConstruct

import com.hp.mailbox.reader.service.InboxReader

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class InboxReaderExchange implements InboxReader {

	private static final Integer MAX_ITEMS=50

	@Value('${username}')
	String username
	@Value('${password}')
	String password
	@Value('${ews.server}')
	String server
	@Value('${ews.protocol}')
	String protocol

	ExchangeService service = new ExchangeService()

	Logger log = LoggerFactory.getLogger(this.class)

  @PostConstruct
	void setup(){
		service.setUrl(new URI(server))
		ExchangeCredentials credentials = new WebCredentials(username, password, 'AUTH')
		service.setCredentials(credentials)
		service.autodiscoverUrl(mailbox,  new RedirectionUrlCallback(protocol))
	}


	void read(){
		Folder folder = Folder.bind(service, WellKnownFolderName.Inbox)
		log.info "folderId: ${folder}"		
		FindItemsResults<Item> results = service.findItems(folder.getId(), new ItemView(MAX_ITEMS))		
		for (Item item : results) {
			EmailMessage emailMessage = EmailMessage.bind(service, item.getId())
			log.info("Sender: ${emailMessage.getSender()}")
			log.info("Subject: ${emailMessage.getSubject()}")
		}
	}

}

class RedirectionUrlCallback implements IAutodiscoverRedirectionUrl {

	String protocol

	RedirectionUrlCallback(String protocol){
		this.protocol = protocol
	}
	public boolean autodiscoverRedirectionUrlValidationCallback(
		String redirectionUrl) {
		return redirectionUrl.toLowerCase().startsWith(protocol)
	}

}