package com.epam.dao;

import java.util.List;

import com.epam.vo.User;

public interface UserDAOInterface {
	
	public void addUser(User user);
    public void updateUser(User user);
    public List<User> listUsers();
    public User getUserById(int id);
    public void removeUser(int id);

}
