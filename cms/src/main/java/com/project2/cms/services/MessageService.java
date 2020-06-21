package com.project2.cms.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.project2.cms.model.Message;
import com.project2.cms.repository.MessageRepository;

@Service
public class MessageService {

  @Autowired
  MessageRepository messageRepository;
  
  public Message createMessage(Message message) {
    message.setId(0);
    return messageRepository.save(message);
  }
  
  public Message update(Message message) {
    Optional<Message> existingMessage = messageRepository.findById(message.getId());
    if (existingMessage.isPresent()) {
      return messageRepository.save(message);
    } else {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }
  
  public Message getMessageById(Integer id) {
    Optional<Message> message = messageRepository.findById(id);
    Message finalMessage = message.get();
    return finalMessage;
  }
}
