package Ex0714;

import java.util.Scanner;

public class Ex02_Score_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int input = 0;
		int student = 0;
		int[] num = null;
		int max = 0;
		int i = 0;
		int j = 0;
		int sum = 0;
		int avg = 0;
		int temp = 0;
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("  1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택  > ");
			input = scan.nextInt();
			
			switch(input) {
			case 1:
				System.out.print("학생수  > ");
				student = scan.nextInt();
				num = new int[student];
				System.out.println("학생수는 "+num.length+"명 입니다");
				
				break;
			case 2:
				for(i=0;i<num.length;i++) {
					
					System.out.print((i+1)+"번 째 학생점수 : ");
					num[i] = scan.nextInt();	
				}
				break;
			case 3:
				for(i=0;i<num.length;i++) {
					System.out.println((i+1)+"번 째 학생점수 : "+num[i]);
				}
				break;
			case 4:
				
				for(i=0;i<num.length;i++) {
					for(j=i+1;j<num.length;j++) {
						if(num[i]>num[j]) {
							temp = num[i];
							num[i] = num[j];
							num[j] = temp;	
						}
					}
				}
				for(i=0;i<num.length;i++) {	
						if(max<num[i]) {
							max = num[i];
						}sum = sum + num[i];
						avg = sum/num.length;
				}System.out.println("최고점수 : "+max);
				System.out.println("평균점수 : "+avg);
				for(i=0;i<num.length;i++) {
					System.out.println(num[i]);
				}	
					
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("위에 숫자 만 입력해주세요.");
				break;
			
				
			}
			
		}while(run);
		
	}

}
