package quest;

import java.util.Scanner;

public class Ex03_If {

	public static void main(String[] args) {
		//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� 
		//B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F
		//�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner scan = new Scanner(System.in);
		
		int score ;
		
		score = 0;
		System.out.print("");
		score=scan.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");	
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
			}else {
				System.out.println("F");
			}scan.close();
	}

}
