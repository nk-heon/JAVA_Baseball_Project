package Ex0716_0717;

public class Car {
	int gas;
	
	//생성자 선언
	Car(int gas){
		this.gas = gas;
	}
	// 리턴 이 아님 보이드로 gas변수를 지정.
	void setGas(int gas) {
	// gas를 확정지어 줌.
		this.gas = gas;
	}
	//리턴 이며 타입은 불 타입 메소드는를 지정해주고 매개변수는 없음.
	boolean isLeftGas() {
	//
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		boolean run = true;
		while (run) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas 잔량:"+gas+")");
				run = false;
			}
		}
	}
}
