package Ex0715;

public class Mobile {
	String company = "�Ｚ";
	String model;
	String color;
	int type;//4G 5G
	
	//��� �ʵ带 �Ű������� �ϴ� ������   �⺻������ (�Ű�����)
	Mobile(String company,String model,String color,int type){
		//���� ���� �Ű������� ��� ���� ���� �ʵ忡 ����
		this.company = company;
		this.model = model;
		this.color = color;
		this.type = type;
	}	
	
	//�⺻������ ����(�Ű������� �Է����� �ʰ� �Ϸ���  �⺻������ ����)
	Mobile(){
		
	}
	//������overloaing : �����ڸ� ���� �� ������ �� ����
	
	
	Mobile(String model,String color,int type){
		this.model = model;
		this.color = color;
		this.type = type;
		
		
	}
}
