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
			
			System.out.println("1���� 100���� ���ڸ� �Է��Ͻÿ�.");
			num = scan.nextInt();
			if(random>num) {
				System.out.println("�� ū���� �Է�");
			}else if(random<num) {
				System.out.println("�� �������� �Է�");
				
			}
			count++;
		}while(num!=random);
			System.out.println("������ϴ�");
			System.out.println("�õ�Ƚ����"+count+"�� �Դϴ�.");
			scan.close();
	}

}
