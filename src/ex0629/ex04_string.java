package ex0629;

public class ex04_string {

	public static void main(String[] args) {
		//���ڿ�
		//����.equals("����")�� ���ڿ���  true , false �� ���� ���ִ�.
		String strVar1 = "";
		String strVar2 = null;
		
		strVar1 = "�ƹ������̳� �� ���ϴ�. :12223asjkdd";
		strVar2 = "sad";
		System.out.println(strVar1);
		System.out.println(strVar2);
		
		String strVar3 = "";
		String strVar4 = "";
		String strVar5 = "";
		String result = "";
		
		strVar3 = "�ڹ�";
		strVar4 = "�Ҹ��ϳ׿� : ";
		strVar5 = "����ֳ׿� : ";
		
		result = strVar3 + strVar4;
		System.out.println(result + (10 + 20 + 10 - 3));
		
		result = strVar3 + strVar5;
		System.out.println(result + 10 * 2);
		
		result = strVar4 + strVar5;
		System.out.println(result);

		
	}
}
