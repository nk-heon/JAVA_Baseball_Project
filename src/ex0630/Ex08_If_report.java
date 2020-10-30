package ex0630;
       
import java.util.Scanner;
       
public class Ex08_If_report {
       
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("점수는?? : ");
		score = scan.nextInt();
		
		if(score>=90) {
			System.out.println("A학점");
			}else if(score>=80) {
				System.out.println("B학점");
			}else if(score>=70) {
				System.out.println("C학점");
			}else if(score>=60) {
				System.out.println("D학점");
			}else {
			System.out.println("F학점");
			scan.close();
			
			}
		}   
	}