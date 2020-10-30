package ex0630;

import java.util.Scanner;

public class Ex05_Calculator {

	public static void main(String[] args) {
		/*
		 * 간단한 계산기 만들기
		 * -덧셈만 가능한 계산기
		 * -정수 두 개를 입력받아 덧셈한 결과를 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		int num1;
		
		num1 = 0;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		
		num1 = scan.nextInt();
		
		int num2;
		
		num2 = 0;
		System.out.print("두번째 숫자를 입력하세요 : ");
		
		num2 = scan.nextInt();
		
		int result;
		result = num1+num2;
		System.out.print("덧셈결과는"+ result +"입니다.");
		
		scan.close();
	}

}
