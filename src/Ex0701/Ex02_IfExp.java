package Ex0701;

import java.util.Scanner;

public class Ex02_IfExp {

	public static void main(String[] args) {
		/*
		 * �հ�, ���հ� ��� ���α׷�
			1. �Է°� : �г�, ������ ���� �Է� ����
			2. �հ�, ���հ� �Ǻ� ����
			- 1~3�г��� ��� : ������ 60�� �̻��̸� �հ�
			- 4�г��� ��� 70�� �̻��̸� �հ�
			- �г⺰ ���õ� ������ ���� ���ϸ� ���հ��̶�� ���
		 */
		Scanner scan = new Scanner(System.in);
		
		int grade,score;
	
		grade = 0;
		
		score = 0;
		scan.close();
		System.out.print("�г�?? : ");
		grade = scan.nextInt();
		System.out.print("������?? : ");
		score = scan.nextInt();
			if(grade==4) {
				if(score>=70) {
					System.out.println("�հ�");
					}else {
						System.out.println("���հ�");
			}
				if(grade>=3) {			
					}if(score>=60) {
						System.out.println("�հ�");
					}else {
						System.out.println("���հ�");
					}
			}
				}
		}


