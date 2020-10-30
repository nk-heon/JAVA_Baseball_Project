package ex0630;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/*
		 * 성적 출력 하기
		 * 자바 점수가 60점 이상이면 합격해습니다. 출력
		 * 60점 미만이면 불합격했습니다. 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("성적출력하기");
		System.out.print("자바 점수입력 : ");
		score = scan.nextInt();
		
		if(score>=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		scan.close();
		}
	}
		
}
