package Ex0715;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "������";
		stu1.gender = "����";
		stu1.speciality = "����� ���̴�";
		stu1.age = 23;
		stu1.exp = false;
		System.out.println(stu1.name);
		System.out.println(stu1.gender);
		System.out.println(stu1.speciality);
		System.out.println(stu1.age);
		System.out.println(stu1.exp);
		System.out.println(stu1.toString());
		
		//�Ű������� �ִ� �����ڸ� �̿��� ��ü ����
		Student stu2 = new Student("������","����","����� ���̴�",23,false);
		System.out.println(stu2.toString());
		
		
		
		

	}

}
