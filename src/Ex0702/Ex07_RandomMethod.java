package Ex0702;

public class Ex07_RandomMethod {

	public static void main(String[] args) {
		/*
		 * Random �޼ҵ�
		 * Ư�� ���� ������ ���� �ϳ��� ������ִ� �޼ҵ�
		 *
		 *math = ����ȯ
		 *
		 */
		//1~10������ ���ڶ� �߻���Ű��
	
	int num = 0;
	num = (int)(Math.random()*6) + 1;
	
	System.out.println("�ζ� "+num);
	}

}
