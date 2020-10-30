package Ex0702;

import java.util.Scanner;

public class Ex01_If_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("첫번째 값 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 값 : ");
		num2 = scan.nextInt();
		scan.close();
		
		if(num1==num2) {
			System.out.print("똑같다 : "+num1);
		} else if(num1>=num2) {
			System.out.print("이게 크다 : "+num1);
		} else if(num1<=num2) {
			System.out.print("이게 크다 : "+num2);
		}else {
			
		}
	}

}
