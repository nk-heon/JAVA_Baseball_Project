package Ex0723;

public class CellphoneMain {

	public static void main(String[] args) {
		// CellPhone Ŭ������ ��ü ����
		Cellphone cp = new Cellphone();
		cp.button = "��ư 10��";
		cp.color = "red";
		cp.message = "�޽���";
		cp.model = "��ȭ��";
		
		cp.hangOn();
		cp.hangOff();
		//�ڽ�Ŭ����(CellPhon) �޼ҵ� ȣ��
		cp.sendMessage("�ȳ�");
		cp.powerOn();
		cp.hangOn();
		
		SmartPhone sp = new SmartPhone();
		sp.button = "��ġ��ũ��";
		sp.color = "black";
		sp.message = "ī��";
		sp.model = "������";
		sp.type = "lte";
		sp.call("��������");
		
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("�ȳ�");
		sp.sendMessage("�ȳ�");
		
		
	}

}
