package Ex0708;

import java.util.Scanner;

public class Ex01_do_While_OddOrEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean end = true;
		do {
			System.out.print("숫자를 입력 : ");
			num = scan.nextInt();
			if(num % 2 == 0 && num > 0) {
				System.out.println("홀수");
			}else if(num % 2 == 1){
				System.out.println("짝수");	
			}else {
				end = false;
			}					
		}while(end);
		
			System.out.println("종료");
			scan.close();
		
		

	}

}
