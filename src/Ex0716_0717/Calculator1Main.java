package Ex0716_0717;

import java.util.Scanner;

public class Calculator1Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator1 cal = new Calculator1();
		int x = 0;
		int y = 0;
		int menu = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.���� | 3.���� | 4.������");
			System.out.println("---------------------------------");
			System.out.print("���� > ");
			menu = scan.nextInt();
			if(menu==5) {
				run = false;
				System.out.println("���α׷� ����");
			}else if(menu==4) {
				
			}
		}
		
		
	}

}
