package com.learnspring.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.learnspring.vo.User;

public class UserDAO   {
	
	List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void register(User user) {
		users.add(user);

	}

	public User getById(int id) {

		for (User user : users) {
			if (user.getUserId() == id) {
				return user;
			}
		}
		return null;

	}

	public User getUserByEmail(String email) {

		for (User user : users) {
			if (user.getUserEmail() == email) {
				return user;
			}
		}
		return null;

	}

	public User getUserByName(String name) {

		for (User user : users) {
			if (user.getUserName() == name) {
				return user;
			}
		}
		return null;

	}

	public void getAllUsers() {

		Iterator<User> itr = users.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			User user = (User) itr.next();
			System.out.println(user.getUserId() + " " + user.getUserName() + " " + user.getUserEmail());
		}
	}

}
