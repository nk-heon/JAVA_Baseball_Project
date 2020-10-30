package Ex0723;

public class CellphoneMain {

	public static void main(String[] args) {
		// CellPhone 클래스의 객체 생성
		Cellphone cp = new Cellphone();
		cp.button = "버튼 10개";
		cp.color = "red";
		cp.message = "메시지";
		cp.model = "전화기";
		
		cp.hangOn();
		cp.hangOff();
		//자식클래스(CellPhon) 메소드 호출
		cp.sendMessage("안녕");
		cp.powerOn();
		cp.hangOn();
		
		SmartPhone sp = new SmartPhone();
		sp.button = "터치스크린";
		sp.color = "black";
		sp.message = "카톡";
		sp.model = "아이폰";
		sp.type = "lte";
		sp.call("여보세요");
		
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("안녕");
		sp.sendMessage("안녕");
		
		
	}

}
