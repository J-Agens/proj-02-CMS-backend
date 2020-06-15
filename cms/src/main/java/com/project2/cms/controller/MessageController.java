package com.project2.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project2.cms.model.Inbox;
import com.project2.cms.model.Message;
import com.project2.cms.services.MessageService;

@RestController
public class MessageController {
  
  @Autowired
  MessageService messageService;
  
  @PostMapping("/messages")
  public Message addNewMessage(@RequestBody Message message) {
//    Inbox msgInbox = message.getInbox();
//    message.setInbox(msgInbox);    
    return messageService.createMessage(message);
  }

}
