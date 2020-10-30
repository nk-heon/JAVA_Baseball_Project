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
	
	//public : 공용  private : 사적   
		// 		 ( 접근제한자 )
		//private는 필드 객체들앞에 쓸 것.
	
	/*
	 * get, set 메소드
	 *  사용 이유 : 필드에 직접 접근이 아닌 메소드를 통한 간접 접근하여
	 *  		필드값 지정 및 수정
	 *  get 메소드 : 외부에서 필드값을 쓰고자 할 때
	 *  set 메소드 : 외부에서 필드값을 지정할 때
	 */
	//name 필드에 대한 get,set 메소드 선언
	
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
	//source에 불 타입은 is가 들어감
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
