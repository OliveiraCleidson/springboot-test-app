package com.learning.restfundamentals.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages", produces = MediaType.APPLICATION_JSON_VALUE)
public class MessageController {

  @Autowired
  private MessageService messageService;

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Message createMessage(@RequestBody Message message) {
    return messageService.createMessage(message);
  }

  @GetMapping
  @ResponseBody
  public List<Message> getMessages() {
    return messageService.getAllMessages();
  }

}