package Ex0716_0717;

import java.util.Date;

public class Application {

	public void enter(Student stu) {
		System.out.println("Application Ŭ������ enter �޼ҵ�");
		System.out.println(stu.name+"�� �ԽǿϷ�");
		System.out.println("�Խǽð� : "+new Date());
	}

	
		public void view(Student stu) {
			System.out.println(stu.toString());
			
	}	
		public void revise(Student stu) {
			//���⼭ ���� �Ҽ� �ִ�.
			stu.address = "����Ư����";
			System.out.println(stu.toString());
		}
		
		
}
