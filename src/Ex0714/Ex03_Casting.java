package Ex0714;

public class Ex03_Casting {

	public static void main(String[] args) {
		/*
		 *  ����ȯ
		 *  Ư�� Ÿ���� ������ �ٸ� Ÿ���� ������ ��ȯ�ϴ� ��
		 *  1.�ڵ� ����ȯ
		 *  - ũ�Ⱑ ���� Ÿ���� ū Ÿ������ ��ȯ
		 *  2.���� ����ȯ
		 *  - ũ�Ⱑ ū Ÿ���� ���� Ÿ������ ��ȯ 
		 */
		int intvar = 10;
		double doublevar = 1.0;
		//�ڵ�����ȯ 
		System.out.println("�ڵ�����ȯ");
		doublevar = intvar;
		System.out.println(intvar);
		System.out.println(doublevar);
 		
		//��������ȯ (int) �߰�
		System.out.println("��������ȯ");
		intvar = (int) doublevar;
		System.out.println(intvar);
		System.out.println(doublevar);
	}

}
