package com.epam.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epam.vo.User;

@Configuration
@ComponentScan(basePackages="com.epam")
public class AppConfig {
	
	
    @Bean(name="user")
    @Scope("prototype")
    public User user() {
        return new User();
    }
	
    /*@Bean(name="userDAO")
    public UserDAO userDAO() {
        return new UserDAO();
    }
    
    @Bean(name="userService")
    public UserService userService() {
        return new UserService();
    }
    
    @Bean(name="userArrayList")
    public List<User> userArrayList() {
        return new ArrayList<User>();
        
    }*/
}