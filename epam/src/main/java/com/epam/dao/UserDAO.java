package com.epam.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.epam.vo.User;

@Repository("userDAO")
public class UserDAO implements UserDAOInterface {

	@Autowired
	List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		users.add(user);

	}

	public void updateUser(User user) {
		
		users.set(user.getUserId(), user);

	}

	public List<User> listUsers() {

		return users;
	}

	public User getUserById(int id) {
		for (User user : users) {
			if (user.getUserId() == id) {
				return user;
			}
		}
		return null;
	}

	public void removeUser(int id) {

		users.remove(id);

	}

	public User getUserByName(String name) {

		for (User user : users) {
			if (user.getUserName() == name) {
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

	public void printAllUsers() {

		Iterator<User> itr = users.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			User user = (User) itr.next();
			System.out.println(user.getUserId() + " " + user.getUserName() + " " + user.getUserEmail());
		}
	}
}
