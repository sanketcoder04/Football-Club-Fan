package league;

public class Fan {
	String name;
	int age;
	String email;
	
	public Fan(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void fanDetails() {
		System.out.println("Fan Details : ");
		System.out.println(name + " " + age);
		System.out.println("Email Id : " + email);
	}
}
