package Ex0708;

import java.util.Scanner;

public class Ex02_Do_While_mean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int count = 0;
		boolean run = true;
		System.out.println("정수를 입력하고 마지막을 0을 입력하시오 : ");
		
		do {
			num = scan.nextInt();
			if(num == 0) {
				run = false;
			}else {
				sum = sum + num;
				count++;
			}
			
		}while(run);
			System.out.println("입력한 수는"+count+"개");
			System.out.println("평균은"+(sum/count)+"입니다.");
	
			scan.close();
	}
}