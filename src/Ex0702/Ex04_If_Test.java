package Ex0702;

import java.util.Scanner;

public class Ex04_If_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�. : ");
		num = scan.nextInt();
		
		
		
		 if(num%2==0) {
			 System.out.print("¦");
	}	else 
	         System.out.print("Ȧ ");
		 scan.close();
	}
	}


