package Ex0708;

import java.util.Scanner;

public class Ex02_Do_While_mean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int count = 0;
		boolean run = true;
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��Ͻÿ� : ");
		
		do {
			num = scan.nextInt();
			if(num == 0) {
				run = false;
			}else {
				sum = sum + num;
				count++;
			}
			
		}while(run);
			System.out.println("�Է��� ����"+count+"��");
			System.out.println("�����"+(sum/count)+"�Դϴ�.");
	
			scan.close();
	}
}