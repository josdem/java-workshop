package com.jos.dem.mailbox.reader

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value

import com.jos.dem.mailbox.reader.service.InboxReader
import com.jos.dem.mailbox.reader.service.impl.InboxReaderPop3
import com.jos.dem.mailbox.reader.service.impl.InboxReaderImap
import com.jos.dem.mailbox.reader.service.impl.InboxReaderExchange

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Component
class Launcher{

  @Autowired
  @Qualifier('inboxReaderExchange')
  InboxReader inboxReader

  Logger log = LoggerFactory.getLogger(this.class)

  void start(){
    log.info 'Reading message'
    inboxReader.read()
  }

}