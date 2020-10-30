package Ex0710;

import java.util.Scanner;

public class Ex06_Array_NumberChoice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = {1,2,5,4,3,7,6,9,10,8};
		int i = 0;
		int input = 0;
		System.out.println("{1,2,5,4,3,7,6,9,10,8}");
		System.out.print("숫자입력 : ");
		input = scan.nextInt();
		
		for(i=0;i<num.length;i++) {
			
			if(input==num[i]) {
				
				System.out.println(num[i]+"는"+(i+1)+"번째에 있습니다");
			}
		}

	}

}
