package Ex0716_0717;

import java.util.Date;

public class Application {

	public void enter(Student stu) {
		System.out.println("Application 클래스의 enter 메소드");
		System.out.println(stu.name+"님 입실완료");
		System.out.println("입실시간 : "+new Date());
	}

	
		public void view(Student stu) {
			System.out.println(stu.toString());
			
	}	
		public void revise(Student stu) {
			//여기서 변경 할수 있다.
			stu.address = "서울특별시";
			System.out.println(stu.toString());
		}
		
		
}
