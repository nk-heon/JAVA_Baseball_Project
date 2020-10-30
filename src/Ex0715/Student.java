package Ex0715;

public class Student {
	//DTO(Data Transfer Object) : 데이터를 담아서 전달하기 우한 클래스
	String name ;
	String gender;
	String speciality;
	int age;
	boolean exp;
	
	
	//Student(String name,String gender,String speciality,int age,boolean exp ){
	//	
		//this.name=name;
		//this.gender=gender;
		//this.speciality=speciality;
		//this.age=age;
		//this.exp=exp;
	//
	//	
	//	
	//}
	
	Student(){
		
	}
	
	public Student(String name, String gender, String speciality, int age, boolean exp) {
		super();
		this.name = name;
		this.gender = gender;
		this.speciality = speciality;
		this.age = age;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", speciality=" + speciality + ", age=" + age + ", exp="
				+ exp + "]";
	}
	
	
}
