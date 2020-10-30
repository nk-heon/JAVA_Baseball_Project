package Ex0714;

public class Car_Main {

	public static void main(String[] args) {
		/* Car 클래스를 객체로 선언하여
		 * Car 클래스가 가지고 있는 필드를 사용
		 *  * 객체 선언방법
		 *    '객체로 만들 클래스이름' 변수명 = new  '객체클래스의 생성자형식';
		 */
		//Car클래스의 객체를 car1이라는 이름으로 선언
		//car1 : car 클래스 타입의 변수
		Car car1 = new Car();//기본생성자
		// Car 클래스가 가지고 있는 color 필드에 값 대입
		car1.color = "rad";
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);
		
		String var = "";
		var = car2.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		
		// car3의 모든 필드값 출력
		System.out.println(car3.color);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);
		//int num;
		//System.out.println(num);
		car3.company = "BMW";
		System.out.println(car3.company);
		
		//매개변수가 있는 생성자를 활용한 객체 선언
		Car Car4 = new Car("마이바흐");
		//이러면 Car클래스에 매개변수가 있는 생성자에 model로 들어간다.
		System.out.println(Car4.color);
		System.out.println(Car4.company);
		System.out.println(Car4.model);
		System.out.println(Car4.speed);
		System.out.println(Car4.type);
		
	}

}
