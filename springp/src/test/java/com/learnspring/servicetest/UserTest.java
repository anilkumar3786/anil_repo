package com.learnspring.servicetest;



import com.learnspring.services.UserService;
import com.learnspring.vo.User;

public class UserTest {
	
	public static void main(String args[]){
		
		//getById, getUserByEmail, getUsersByName, getBookedTickets
		
		User user1 = new User(1, "Anil", "anil_aleti@epam.com");
		User user2 = new User(2, "Sidhu", "siddu_stapathy@epam.com");
		User user3 = new User(3, "Bala", "bala_cintala@epam.com");
		User user4 = new User(4, "Ravi", "ravi_bobade@epam.com");
		
		
		
		UserService userService = new UserService();
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);
		userService.register(user4);
		
		userService.getAllUsers();
	
		/*String str;
		userService.getById(2);
		str =userService.getById(2).toString();
		
		System.out.println(str);*/
		
		
		String str;
		
		str =userService.getUserByName("Anil").toString();
		
		System.out.println(str);
		
		/*Iterator<User> itr=users.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    User user = (User)itr.next();  
		    System.out.println(user.getUserId() +" "+user.getUserName()
		    +" "+user.getUserEmail());  
		  }  */
		
		/*int userId  = userService.getById();
		String userName  = userService.getUsersByName();
		String userEmailId  = userService.getUserByEmail();*/
		
		
		
		
		
	}

}
