package Ex0702;

import java.util.Scanner;

public class Ex01_If_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("ù��° �� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° �� : ");
		num2 = scan.nextInt();
		scan.close();
		
		if(num1==num2) {
			System.out.print("�Ȱ��� : "+num1);
		} else if(num1>=num2) {
			System.out.print("�̰� ũ�� : "+num1);
		} else if(num1<=num2) {
			System.out.print("�̰� ũ�� : "+num2);
		}else {
			
		}
	}

}
