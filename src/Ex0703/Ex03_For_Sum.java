package Ex0703;

import java.util.Scanner;

public class Ex03_For_Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int startnum = 0;
		int endnum = 0;
		int sum = 0;
		System.out.print("초기값 입력 : ");
		startnum = scan.nextInt();
		System.out.print("끝값 입력 : ");
		endnum = scan.nextInt();
		scan.close();
		for(num=startnum;num<=endnum;num++) {
			sum = sum + num;
			System.out.print(num);
			if(num<endnum) {
				System.out.print("+");
			}else{
				System.out.print("=");
				System.out.println(sum);
			}
				
		}System.out.println(startnum+"부터"+endnum+"까지의 합은"+sum+"입니다.");
		
	}
	

}
