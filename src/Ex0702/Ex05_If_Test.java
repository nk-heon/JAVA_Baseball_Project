package Ex0702;

import java.util.Scanner;

public class Ex05_If_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("1�� �Է� : ");
		num1 = scan.nextInt();
		System.out.print("2�� �Է� : ");
		num2 = scan.nextInt();
		System.out.print("3�� �Է� : ");
		num3 = scan.nextInt();
		
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.print(num1);
			}
		else {
			System.out.print(num3);
		}	
		}else if(num1<num2) {
			if(num2>num3) {	
				System.out.print(num2);
		}else {
			System.out.print(num3);
			}	
		}scan.close();
	}
}