package Ex0702;

import java.util.Scanner;

public class Ex04_If_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("숫자를 입력하시오. : ");
		num = scan.nextInt();
		
		
		
		 if(num%2==0) {
			 System.out.print("짝");
	}	else 
	         System.out.print("홀 ");
		 scan.close();
	}
	}


