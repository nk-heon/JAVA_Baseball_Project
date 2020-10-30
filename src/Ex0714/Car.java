package Ex0714;

public class Car {
	/*
	 * 메소드가 없는 Class는 그냥 클래스로고 함.
	 * 클래스
	 * 1. 필드(field)
	 *  - 데이터 저장을 위한 공간
	 *  - 변수랑 비슷한 개념
	 *  
	 * 2. 생성자(constructor)
	 * 	- 객체를 만들 때 따라야 하는 규칙을 정의
	 *  - 생성자는 여러 개 만들 수 있음.
	 *  - 생성자는 매개변수가 있을 수도 있고 없을 수도 있음.
	 *  - 생성자의 이름은 클래스 이름과 동일해야 함
	 *  
	 * 3. 메소드(Method)
	 *  - 특정 기능 수행을 정의한 블록
	 *  - 매개변수가 있을 수도 있고 없을 수도 있음.
	 *  - main 클래스 등에서 메소드를 호출하면 자신이 가지고 있는 기능을 수행한 후
	 *    리턴(return)을 함.(리턴이 없는 경우도 있음.) 
	 */
	//필드 (하늘색으로 나온것들.)
	String color;
	int speed;
	String type;
	String model;
	String company="아우디";
	
	
	
	//기본 생성자 선언
	Car(){		
	}
	
	
	
	// 매개변수가 있는 생성자 선언
	// 매개변수 : model
	Car(String model){
		this.model = model;
		
	}	
}
