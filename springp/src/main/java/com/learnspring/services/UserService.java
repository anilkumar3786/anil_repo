package com.learnspring.services;

import com.learnspring.dao.UserDAO;
import com.learnspring.vo.User;

public class UserService {

	UserDAO userDao = new UserDAO();

	public void register(User user) {

		userDao.register(user);

	}

	public User getById(int id) {

		return userDao.getById(id);

	}

	public User getUserByEmail(String email) {

		return userDao.getUserByEmail(email);

	}

	public User getUserByName(String name) {

		return userDao.getUserByName(name);

	}

	public void getAllUsers() {

		userDao.getAllUsers();
	}

}
