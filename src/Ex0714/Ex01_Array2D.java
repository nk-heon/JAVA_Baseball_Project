package Ex0714;

import java.util.Scanner;

public class Ex01_Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//������ �迭 num �̸��� ����(������ �迭�� ����� ���� �ƴ�)
		int[] num = null;
		//num�� ����ϸ� ������ ���� ���� ���� �޽����� ���.
		//System.out.println(num.length);
		//��ĳ�� �Է��� ���� ������ ����
		System.out.println("������ �迭 ũ��");
		int size = scan.nextInt();
		//�Է¹��� ���ڸ� �迭 ũ�⿡ ����
		num = new int[size];
		//int[] num1 = new int[5];
		System.out.println(num.length);
		
		//���� !!!!! 
		//���������� ���������� �����ؼ� �ڵ� �Ұ� !!
		//���������� �Լ��ۿ��� ������ ���� �Է��Ͽ� ��ü �Լ��� ���� �ֵ��� �Ѵ�.
		//���������� �Լ��ȿ� ������ ���� �Է��Ͽ� �� �Լ� �ȿ����� ���� �ִ�.
	}

}
