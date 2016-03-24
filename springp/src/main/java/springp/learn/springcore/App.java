package springp.learn.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBean.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.setName1("hi");
		
		obj.printHello();
		
	
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
		
		obj1.printHello();
		//obj1.printMessage("hello------------");
		
		
	}

}
