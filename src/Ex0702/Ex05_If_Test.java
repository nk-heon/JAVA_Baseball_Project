package Ex0702;

import java.util.Scanner;

public class Ex05_If_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("1번 입력 : ");
		num1 = scan.nextInt();
		System.out.print("2번 입력 : ");
		num2 = scan.nextInt();
		System.out.print("3번 입력 : ");
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