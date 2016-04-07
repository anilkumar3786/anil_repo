package com.epam.usertest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.configs.AppConfig;
import com.epam.service.UserService;
import com.epam.vo.User;

public class UserTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	User userObj1 = (User) context.getBean(User.class);
	User userObj2 = (User) context.getBean(User.class);

	UserService userService = (UserService) context.getBean(UserService.class);

	public void testAddUserMethods() {

		System.out.println("------------Test AddUser Method------Begin---");
		userObj1.setUserId(1);
		userObj1.setUserName("Anil");
		userObj1.setUserEmail("anil@epam.com");

		userObj2.setUserId(2);
		userObj2.setUserName("Ravi");
		userObj2.setUserEmail("ravi@epam.com");

		userService.addUser(userObj1);
		userService.addUser(userObj2);

		userService.printAllUsers();

		System.out.println("------------Test AddUser Method------END-----");

	}

	public void testGetUserByName() {

		System.out.println("------------Test getUserByName Method------Begin---");

		userObj1.setUserId(1);
		userObj1.setUserName("Anil");
		userObj1.setUserEmail("anil@epam.com");

		userObj2.setUserId(2);
		userObj2.setUserName("Ravi");
		userObj2.setUserEmail("ravi@epam.com");

		userService.addUser(userObj1);
		userService.addUser(userObj2);

		System.out.println("UserName" + userService.getUserByName("Anil"));
		System.out.println("UserName" + userService.getUserByName("Ravi"));

		System.out.println("------------Test getUserByName Method------END---");

	}

	public void testGetUserById() {

		System.out.println("------------Test getUserById Method------Begin---");

		userObj1.setUserId(1);
		userObj1.setUserName("Anil");
		userObj1.setUserEmail("anil@epam.com");

		userObj2.setUserId(2);
		userObj2.setUserName("Ravi");
		userObj2.setUserEmail("ravi@epam.com");

		userService.addUser(userObj1);
		userService.addUser(userObj2);

		System.out.println("UserID" + userService.getUserById(1));
		System.out.println("UserID" + userService.getUserById(2));

		System.out.println("------------Test getUserByName Method------END---");

	}
	
	public void testUpdateUser() {

		System.out.println("------------Test getUserById Method------Begin---");

		userObj1.setUserId(1);
		userObj1.setUserName("Anil");
		userObj1.setUserEmail("anil@epam.com");

		userObj2.setUserId(2);
		userObj2.setUserName("Ravi");
		userObj2.setUserEmail("ravi@epam.com");

		userObj2.setUserId(2);
		userObj2.setUserName("Bala");
		
		
		userService.addUser(userObj1);
		userService.addUser(userObj2);

		System.out.println("UserID" + userService.getUserById(1));
		userService.updateUser(userObj2);

		userService.printAllUsers();
		
		System.out.println("------------Test getUserByName Method------END---");

	}
	
	public void apllicationContextClose() {

		
		((AbstractApplicationContext) context).close();
	}

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		UserTest test = new UserTest();

		//test.testAddUserMethods();
		//test.testGetUserByName();
	//	test.testGetUserById();
		test.testUpdateUser();
		
		test.apllicationContextClose();

	}
}
