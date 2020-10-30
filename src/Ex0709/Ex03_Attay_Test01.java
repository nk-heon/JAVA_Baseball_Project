package Ex0709;

import java.util.Scanner;

public class Ex03_Attay_Test01 {

	public static void main(String[] args) {
		//크기가 5인 정수형 배열을 선언하여
		//갑을 알아서 입력하고
		//입력된 값들의 총합과 평균을 구하시오.
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		
		//다른 방법 예1)
		System.out.println("배열의 개수를 입력해주세요.");
		int T = scan.nextInt();
		int [] num1 = new int[T];
		System.out.println("");
		//다른 방법 예2)
		//num1 = new int[5];
		//num1[0] = scan.nextInt();
		//num1[1] = scan.nextInt();
		//num1[2] = scan.nextInt();
		//num1[3] = scan.nextInt();
		//num1[4] = scan.nextInt();
		for(i = 0;i<num1.length;i++) {
			num1[i]=scan.nextInt();
			sum += num1[i];
			
		}	
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 값 : "+sum/num1.length);
		scan.close();
	}
	
}
