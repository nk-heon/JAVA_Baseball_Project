package Ex0723;
//Cellphone 클래스를 phone의 자식클래스로 선언하기
public class Cellphone extends phone {

	String button;
	String message;
	
	
	//생성자
	Cellphone(){
		
		
	}
	//button, model, color를 매개변수로 하는 생성자 선언
	Cellphone(String button,String model,String color) {
		this.button = button;
		this.model = model;
		this.color = color;
	}
	//메소드
	void sendMessage(String message) {
		System.out.println("메세지 전송 :" + message);
	}
	void receiveMessage(String message) {
		System.out.println("메세지 수신 :" + message);
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 메소드 제정의(Overriding) 메소드 선언은 못 바꿈 안에 있는 내용만 변경 가능
	@Override
	void hangOn() {
		System.out.println("cellphon으로 전화를 겁니다. ");
	}
	
	
	
	
	
}
