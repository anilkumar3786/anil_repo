package com.epam.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.dao.UserDAO;
import com.epam.vo.User;

@Service("userService")
public class UserService implements UserServiceInterface {

	@Autowired
	UserDAO userDAO;
	
	
	public void addUser(User user) {

		userDAO.addUser(user);
	}

	public void updateUser(User user) {

		userDAO.updateUser(user);
	}

	public List<User> listUsers() {
		
		return userDAO.listUsers();
	}

	public User getUserById(int id) {
		
		return userDAO.getUserById(id);
	}

	public void removeUser(int id) {
		
		userDAO.removeUser(id);
		
	}

	public User getUserByName(String name) {
		
		return userDAO.getUserByName(name);
		
	}
	
	public User getUserByEmail(String email) {

		return userDAO.getUserByEmail(email);

	}

	public void printAllUsers() {

		userDAO.printAllUsers();
	}
}
