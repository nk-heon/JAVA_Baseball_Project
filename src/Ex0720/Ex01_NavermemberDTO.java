package Ex0720;

public class Ex01_NavermemberDTO {
	//Dater trance object
	
	//필드 선언
	
	private String ID;
	private String password;
	private String name;
	
	//get,set 메소드 선언
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//모든 필드를 매개변수로 하는 생성자
	public Ex01_NavermemberDTO(String iD, String password, String passwordre_reconfirm, String name, int birthday,
			String gender, String email, String phone) {
		
		ID = iD;
		this.password = password;
		this.name = name;
		
	}
	//기본 생성자 선언
	public Ex01_NavermemberDTO() {
			
	}
	@Override
	public String toString() {
		return "Ex01_NavermemberDTO [ID=" + ID + ", password=" + password + ", name=" + name + "]";
	}
	
	

	
}
