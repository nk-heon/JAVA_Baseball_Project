package Ex0720;

public class Ex01_NavermemberDTO {
	//Dater trance object
	
	//�ʵ� ����
	
	private String ID;
	private String password;
	private String name;
	
	//get,set �޼ҵ� ����
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
	
	//��� �ʵ带 �Ű������� �ϴ� ������
	public Ex01_NavermemberDTO(String iD, String password, String passwordre_reconfirm, String name, int birthday,
			String gender, String email, String phone) {
		
		ID = iD;
		this.password = password;
		this.name = name;
		
	}
	//�⺻ ������ ����
	public Ex01_NavermemberDTO() {
			
	}
	@Override
	public String toString() {
		return "Ex01_NavermemberDTO [ID=" + ID + ", password=" + password + ", name=" + name + "]";
	}
	
	

	
}
