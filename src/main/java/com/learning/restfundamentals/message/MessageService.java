package com.learning.restfundamentals.message;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
  @Autowired
  private MessageRepository messageRepository;

  public Message createMessage(Message message) {
    message.setSendedAt(Instant.now());
    return messageRepository.save(message);
  }

  public List<Message> getAllMessages() {
    return messageRepository.findAll();
  }
}