package Ex0702;

import java.util.Scanner;

public class Ex02_If_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		
		
		System.out.print("���ڸ� �Է��Ͻÿ�. : ");
		num1 = scan.nextInt();
		
		if(num1==0) {
			System.out.println("0���� 0�̴�.");
		}else if(num1>-0) {
			System.out.println("���");
		}else if(num1<0) {
			System.out.println("����");
		}else {
			
		}scan.close();
		

	}

}
