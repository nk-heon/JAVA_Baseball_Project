package Ex0723;

public class phone {
	
	/*
	 * ���
	 * �ڹٿ����� ���
	 *  : �θ�Ŭ������ �ʵ�, �޼ҵ� �� ��� �޴°�
	 *  : �θ�Ŭ����, �ڽ�Ŭ������ ������.
	 *  ����� ����
	 *  : ��� �ߺ��� ���� �� ����.
	 *  : �������� ��
	 *  : ��ü�� ������ ������ ����
	 *  ���� ����
	 *  : private��ȣ ������ �ʵ�, �޼ҵ�� ��� �Ұ���
	 *  
	 * 
	 */
	
	//�ʵ� ����
	String model;
	String color;
	
	//�޼ҵ�
	void hangOn() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
	void hangOff() {
		System.out.println("��ȭ�� �����ϴ�. ");
	}
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
}
