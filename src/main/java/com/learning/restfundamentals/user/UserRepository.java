package com.learning.restfundamentals.user;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findByFirstName(String firstName);

  List<User> findByEmail(String email);

  List<User> findByLastName(String lastName);
}