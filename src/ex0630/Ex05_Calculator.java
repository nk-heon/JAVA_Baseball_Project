package ex0630;

import java.util.Scanner;

public class Ex05_Calculator {

	public static void main(String[] args) {
		/*
		 * ������ ���� �����
		 * -������ ������ ����
		 * -���� �� ���� �Է¹޾� ������ ����� ���
		 */
		Scanner scan = new Scanner(System.in);
		
		int num1;
		
		num1 = 0;
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		
		num1 = scan.nextInt();
		
		int num2;
		
		num2 = 0;
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		
		num2 = scan.nextInt();
		
		int result;
		result = num1+num2;
		System.out.print("���������"+ result +"�Դϴ�.");
		
		scan.close();
	}

}
