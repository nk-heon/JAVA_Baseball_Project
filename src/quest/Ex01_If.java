package quest;

import java.util.Scanner;

public class Ex01_If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		scan.close();
		
		if(num1>num2) {
			System.out.println(">");
		}else if(num2>num1) {
				System.out.println("<");
			}else {
				System.out.println("==");
			
		}
		
		
	}

}
