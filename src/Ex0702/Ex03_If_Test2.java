package Ex0702;

import java.util.Scanner;

public class Ex03_If_Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�. : ");
		num = scan.nextInt();
			if(num==0) {
				System.out.println("0���Դϴ�.");
				}else if(num<0) {
					System.out.println(num*-1);
				}else if(num>0) {
					System.out.println(num);
					
				}scan.close();
		}
}