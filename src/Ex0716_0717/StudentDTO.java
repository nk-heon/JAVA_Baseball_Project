package Ex0716_0717;

public class StudentDTO {

	private String name ;
	private String birth ;
	private int age;
	private String address ;
	private String gender;
	private String phone ;
	private String speciality;
	private boolean exp;
	
	//public : ����  private : ����   
		// 		 ( ���������� )
		//private�� �ʵ� ��ü��տ� �� ��.
	
	/*
	 * get, set �޼ҵ�
	 *  ��� ���� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� ���� �����Ͽ�
	 *  		�ʵ尪 ���� �� ����
	 *  get �޼ҵ� : �ܺο��� �ʵ尪�� ������ �� ��
	 *  set �޼ҵ� : �ܺο��� �ʵ尪�� ������ ��
	 */
	//name �ʵ忡 ���� get,set �޼ҵ� ����
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	//source�� �� Ÿ���� is�� ��
	public boolean isExp() {
		return exp;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	public StudentDTO(String name, String birth, int age, String address, String gender, String phone,
			String speciality, boolean exp) {
		super();
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.speciality = speciality;
		this.exp = exp;
	}
	public StudentDTO() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
