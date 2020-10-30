package Ex0715;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "남궁헌";
		stu1.gender = "남성";
		stu1.speciality = "서울대 꿈이다";
		stu1.age = 23;
		stu1.exp = false;
		System.out.println(stu1.name);
		System.out.println(stu1.gender);
		System.out.println(stu1.speciality);
		System.out.println(stu1.age);
		System.out.println(stu1.exp);
		System.out.println(stu1.toString());
		
		//매개변수가 있는 생성자를 이용한 객체 생성
		Student stu2 = new Student("남궁헌","남성","서울대 꿈이다",23,false);
		System.out.println(stu2.toString());
		
		
		
		

	}

}
