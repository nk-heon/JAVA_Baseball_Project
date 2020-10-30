package Ex0716_0717;

public class Student {
	String name;
	String gender;
	String dirth;
	int age;
	String address;
	String phone;
	
	public Student(String name, String dirth, String gender, int age, String address, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public Student(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", phone=" + phone ;
	}
	
	

	
	
	
	
}
