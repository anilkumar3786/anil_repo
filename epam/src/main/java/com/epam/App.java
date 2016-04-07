package com.epam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.epam.configs.AppConfig;
import com.epam.service.UserService;
import com.epam.vo.User;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		User userObj1 = (User) context.getBean(User.class);
		User userObj2 = (User) context.getBean(User.class);
		
		
		
		UserService userService = (UserService) context.getBean(UserService.class);

		
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
		((AbstractApplicationContext) context).close();
	}
}
