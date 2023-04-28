package com.learning.restfulWebService.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.restfulWebService.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
