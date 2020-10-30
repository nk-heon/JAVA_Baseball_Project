package quest;

import java.util.Scanner;

public class Ex04_If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x ;
		int y ;
		
		x = 0;
		y = 0;
		
		System.out.print("");
		x = scan.nextInt();
		System.out.print("");
		y = scan.nextInt();
		scan.close();
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			}
			
			else {
				System.out.println(4);
		}
		}else {
			if(y > 0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
			
		}
			
		
			
		
	}

}
