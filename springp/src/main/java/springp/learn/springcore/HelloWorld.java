package springp.learn.springcore;

public class HelloWorld {
	
	private String name;

	public String getName1() {
		return name;
	}

	public void setName1(String name) {
		this.name = name;
	}
	
	/*public void printMessage(String msg){
		
		System.out.println(msg);
	}
	*/
	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}

}
