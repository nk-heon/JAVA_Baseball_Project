package quest;

import java.util.Scanner;

public class Ex02_If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		boolean yoon = true;
		
		year = scan.nextInt();
		
		
		yoon = (((year%4)==0)&&((year%100)!=0))||(year%400)==0;
		
		System.out.println(yoon);

		scan.close();
	}

}
