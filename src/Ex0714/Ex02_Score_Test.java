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
			System.out.println("  1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("----------------------------------------------------");
			System.out.print("����  > ");
			input = scan.nextInt();
			
			switch(input) {
			case 1:
				System.out.print("�л���  > ");
				student = scan.nextInt();
				num = new int[student];
				System.out.println("�л����� "+num.length+"�� �Դϴ�");
				
				break;
			case 2:
				for(i=0;i<num.length;i++) {
					
					System.out.print((i+1)+"�� ° �л����� : ");
					num[i] = scan.nextInt();	
				}
				break;
			case 3:
				for(i=0;i<num.length;i++) {
					System.out.println((i+1)+"�� ° �л����� : "+num[i]);
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
				}System.out.println("�ְ����� : "+max);
				System.out.println("������� : "+avg);
				for(i=0;i<num.length;i++) {
					System.out.println(num[i]);
				}	
					
				break;
			case 5:
				run = false;
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("���� ���� �� �Է����ּ���.");
				break;
			
				
			}
			
		}while(run);
		
	}

}
