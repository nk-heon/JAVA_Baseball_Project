package Ex0723;

public class SmartPhone extends Cellphone{
	String type;
	
	
	@Override
	void powerOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	void hangOn() {
		System.out.println("스마트폰으로 전화를 겁니다.");
	}
	

}
