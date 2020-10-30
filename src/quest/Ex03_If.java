package quest;

import java.util.Scanner;

public class Ex03_If {

	public static void main(String[] args) {
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 
		//B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
		//를 출력하는 프로그램을 작성하시오.

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
