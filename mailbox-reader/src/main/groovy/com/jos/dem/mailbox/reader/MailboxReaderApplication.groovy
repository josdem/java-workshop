package com.jos.dem.mailbox.reader

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class MailboxReaderApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run MailboxReaderApplication, args
		context.getBean(Launcher.class).start()
	}

}
