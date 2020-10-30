package Ex0701;

import java.util.Scanner;

public class Ex02_IfExp {

	public static void main(String[] args) {
		/*
		 * 합격, 불합격 출력 프로그램
			1. 입력값 : 학년, 점수를 각각 입력 받음
			2. 합격, 불합격 판별 조건
			- 1~3학년인 경우 : 점수가 60점 이상이면 합격
			- 4학년인 경우 70점 이상이면 합격
			- 학년별 제시된 점수를 넘지 못하면 불합격이라고 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		int grade,score;
	
		grade = 0;
		
		score = 0;
		scan.close();
		System.out.print("학년?? : ");
		grade = scan.nextInt();
		System.out.print("점수는?? : ");
		score = scan.nextInt();
			if(grade==4) {
				if(score>=70) {
					System.out.println("합격");
					}else {
						System.out.println("불합격");
			}
				if(grade>=3) {			
					}if(score>=60) {
						System.out.println("합격");
					}else {
						System.out.println("불합격");
					}
			}
				}
		}


