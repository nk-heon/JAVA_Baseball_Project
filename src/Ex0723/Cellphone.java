package Ex0723;
//Cellphone Ŭ������ phone�� �ڽ�Ŭ������ �����ϱ�
public class Cellphone extends phone {

	String button;
	String message;
	
	
	//������
	Cellphone(){
		
		
	}
	//button, model, color�� �Ű������� �ϴ� ������ ����
	Cellphone(String button,String model,String color) {
		this.button = button;
		this.model = model;
		this.color = color;
	}
	//�޼ҵ�
	void sendMessage(String message) {
		System.out.println("�޼��� ���� :" + message);
	}
	void receiveMessage(String message) {
		System.out.println("�޼��� ���� :" + message);
	}
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	// �޼ҵ� ������(Overriding) �޼ҵ� ������ �� �ٲ� �ȿ� �ִ� ���븸 ���� ����
	@Override
	void hangOn() {
		System.out.println("cellphon���� ��ȭ�� �̴ϴ�. ");
	}
	
	
	
	
	
}
