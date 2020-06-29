package com.learning.restfundamentals.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public User createUser(@RequestBody @Valid User newUser) {
    try {
      return this.userService.createUser(newUser);
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  @ResponseBody
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<User> listUsers() {
    return this.userService.findAll();
  }
}