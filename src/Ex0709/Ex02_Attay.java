package Ex0709;

public class Ex02_Attay {

	public static void main(String[] args) {
		//Array
		//������ �迭���� ����
		int[] number;
		int number1[];
		//�迭 �����ϸ鼭 �ʱⰪ ����
		
		int[] number2 = {1,2,3,4};
		//�迭�� ����� ������ ���
		
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		System.out.println(number2[3]);
		//string Ÿ�� �迭�� �����Ͽ� ���� �ٿ� ���� 4���� �̸��� �����ϰ� ���
		String[] str = {"������ ","����� ","�̵��� ","����ȯ "};
		
		str[3] = "������"; // �����Ҷ� ��1)
		
		String n = ""; // �����Ҷ� ��2)
		n = "������";
		str[1] = n;
		
		System.out.print(str[0]);
		System.out.print(str[1]);
		System.out.print(str[2]);
		System.out.println(str[3]);
		//str �迭�� ũ��� 4, ������ �ε����� 3
		//�迭�� ũ�� �� Ȱ���ϱ�
		
		System.out.println(str.length);
		//for���� �̿��Ͽ� �迭�� ����� �� ��� ����ϱ�
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		int[] number3;
		number3 = new int[3];
		int[] number4 = new int[3];
		
		//number4�� ������ ����� �ش�.
		//������ ���� ����.
		System.out.println(number4.length);
		for(int i = 0; i<number4.length; i++) {
			System.out.println(number4[i]);
		}
		
		number3[0] = 1;
		
	}

}
