package Ex0710;

import java.util.Scanner;

public class Ex02_Array_maximum_scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int T = scan.nextInt();
		System.out.print("�ִ밪 : ");
		int m = scan.nextInt();
		System.out.print("���밪 : ");
		int n = scan.nextInt();
		int[] num = new int[T];
		int i = 0;
		int max = num[i];
		
		
		for(i=0;i<num.length;i++) {
			
			num[i] = (int)(Math.random()*m)+n;
			System.out.println(num[i]);
			if(max<num[i]) {
				max = num[i];
			}
		}System.out.println("");
		System.out.println(max);
		
		
	scan.close();	
	}

}
