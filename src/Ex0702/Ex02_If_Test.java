package Ex0702;

import java.util.Scanner;

public class Ex02_If_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		
		
		System.out.print("숫자를 입력하시오. : ");
		num1 = scan.nextInt();
		
		if(num1==0) {
			System.out.println("0값은 0이다.");
		}else if(num1>-0) {
			System.out.println("양수");
		}else if(num1<0) {
			System.out.println("음수");
		}else {
			
		}scan.close();
		

	}

}
