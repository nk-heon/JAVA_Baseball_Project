package ex0630;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/*
		 * ���� ��� �ϱ�
		 * �ڹ� ������ 60�� �̻��̸� �հ��ؽ��ϴ�. ���
		 * 60�� �̸��̸� ���հ��߽��ϴ�. ���
		 */
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("��������ϱ�");
		System.out.print("�ڹ� �����Է� : ");
		score = scan.nextInt();
		
		if(score>=60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		scan.close();
		}
	}
		
}
