package Ex0722;

public class Library_MemberDTO {

	int customer;
	String name;
	String phone;
	

	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Library_MemberDTO() {
		
	}
	
	
	public Library_MemberDTO(int customer, String name, String phone) {
		super();
		this.customer = customer;
		this.name = name;
		this.phone = phone;
	}
	
	
	
}
