package Ex0723;

public class SmartPhone extends Cellphone{
	String type;
	
	
	@Override
	void powerOn() {
		System.out.println("����Ʈ���� �մϴ�.");
	}
	
	@Override
	void hangOn() {
		System.out.println("����Ʈ������ ��ȭ�� �̴ϴ�.");
	}
	

}
