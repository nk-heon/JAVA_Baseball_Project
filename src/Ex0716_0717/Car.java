package Ex0716_0717;

public class Car {
	int gas;
	
	//������ ����
	Car(int gas){
		this.gas = gas;
	}
	// ���� �� �ƴ� ���̵�� gas������ ����.
	void setGas(int gas) {
	// gas�� Ȯ������ ��.
		this.gas = gas;
	}
	//���� �̸� Ÿ���� �� Ÿ�� �޼ҵ�¸� �������ְ� �Ű������� ����.
	boolean isLeftGas() {
	//
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		boolean run = true;
		while (run) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas �ܷ�:"+gas+")");
				run = false;
			}
		}
	}
}
