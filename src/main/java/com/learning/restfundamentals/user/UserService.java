package com.learning.restfundamentals.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return this.userRepository.findAll();
  }

  public User createUser(User newUser) {
    return this.userRepository.save(newUser);
  }

}