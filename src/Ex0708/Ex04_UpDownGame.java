package Ex0708;

import java.util.Scanner;

public class Ex04_UpDownGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Up&Down");
		
		int num = 0;
		int count = 0;
		int random = 0;
		random = (int)(Math.random()*100)+1;
		
		do {
			
			System.out.println("1부터 100까지 숫자를 입력하시오.");
			num = scan.nextInt();
			if(random>num) {
				System.out.println("더 큰수를 입력");
			}else if(random<num) {
				System.out.println("더 작은수를 입력");
				
			}
			count++;
		}while(num!=random);
			System.out.println("맞췄습니다");
			System.out.println("시도횟수는"+count+"번 입니다.");
			scan.close();
	}

}
