package Ex0701;

import java.util.Scanner;

public class Ex01_NestedIf {

	public static void main(String[] args) {
		/*
		 * ��ø If��
		 * ��ø if���� Ȱ���� ������� ���� 
			1. 100���� �ʰ��ϴ� ���� �Է��� �Է¹����� �ʰ��Ͽ����ϴ�. ��� 
			2. ���� ó�� 95~100 : ����� ������ A+ �Դϴ�. 
   				90~94 : ����� ������ A �Դϴ�. 
   				85~89 : ����� ������ B+ �Դϴ�. 
   				80~84 : ����� ������ B �Դϴ�. ~~~~~ 
   				65~69 : ����� ������ D+ �Դϴ�. 
   				60~64 : ����� ������ D �Դϴ�. 
   				60 �̸� : ����� ������ F�Դϴ�.
			3. print ���� ��3���� ���˴ϴ�. 
 				-  �����Է� ���� �� 1�� 
 				- �Է¹����� �ʰ��Ͽ����ϴ�. 1�� 
 				- ����� ������ ~~ �Դϴ�. ����� �� 1�� 
		 */
		Scanner scan = new Scanner(System.in);
		
		int score;
		
		score = 0;
		
		String str;
		
		str = "";
		
		System.out.print("������ �����̳�? : ");

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
				}System.out.print("��� ����"+str+"�Դϴ�.");
		}else {	 
				System.out.println("�Է� ������ �ʰ��߽��ϴ�.");}	
								
			scan.close();
				
	}
}
		
		
		



