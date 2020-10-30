package Ex0701;

import java.util.Scanner;

public class Ex01_NestedIf {

	public static void main(String[] args) {
		/*
		 * 중첩 If문
		 * 중첩 if문을 활용한 학점계산 문제 
			1. 100점을 초과하는 점수 입력은 입력범위를 초과하였습니다. 출력 
			2. 학점 처리 95~100 : 당신의 학점은 A+ 입니다. 
   				90~94 : 당신의 학점은 A 입니다. 
   				85~89 : 당신의 학점은 B+ 입니다. 
   				80~84 : 당신의 학점은 B 입니다. ~~~~~ 
   				65~69 : 당신의 학점은 D+ 입니다. 
   				60~64 : 당신의 학점은 D 입니다. 
   				60 미만 : 당신의 학점은 F입니다.
			3. print 문은 딱3번만 사용됩니다. 
 				-  점수입력 받을 때 1번 
 				- 입력범위를 초과하였습니다. 1번 
 				- 당신의 학점은 ~~ 입니다. 출력할 때 1번 
		 */
		Scanner scan = new Scanner(System.in);
		
		int score;
		
		score = 0;
		
		String str;
		
		str = "";
		
		System.out.print("점수는 몇점이냐? : ");

		score = scan.nextInt();
		
		if(score<=100) {
			if(score>=95){
					str = "A+";
				} else if(score>=90){
					str = "A";
				} else if(score>=85){
					str = "B+";
				} else if(score>=80){
					str = "B";
				} else if(score>=75){
					str = "C+";
				} else if(score>=70){
					str = "C";
				} else if(score>=65){
					str = "D+";
				} else if(score>=60){
					str = "D";
				} else if(score<60) {
					str = "F";	
				}System.out.print("당신 학점"+str+"입니다.");
		}else {	 
				System.out.println("입력 범위를 초가했습니다.");}	
								
			scan.close();
				
	}
}
		
		
		



