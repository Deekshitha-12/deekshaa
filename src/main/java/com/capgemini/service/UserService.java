package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Address;
import com.capgemini.model.User;

public interface UserService {

	User addUser(User user);

	User updateUser(User user);

	User deleteUser(int userId);

	User getUser(int userId);

	List<User> getUsers();
  
}
