package Ex0713;

import java.util.Scanner;

public class Ex01_Coin_Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coin = 0;
		System.out.println("금액 입력: ");
		coin = scan.nextInt();
		int[] change = {500,100,50,10};
		int coinCount = 0;
		for(int i=0;i<change.length; i ++) {
			coinCount = coin/change[i];
			System.out.println(change[i]+"원 동전 :"+coinCount+"개");
			coin = coin % change[i];
		}
	}		

}
