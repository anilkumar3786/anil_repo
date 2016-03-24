package com.learnspring.dao;

import java.util.List;

import com.learnspring.vo.User;

public interface UserDAOInterface {

	public void add(User user);
	public void remove(User user);
	public void update(User user);
}
