package Ex0709;

import java.util.Scanner;

public class Ex03_Attay_Test01 {

	public static void main(String[] args) {
		//ũ�Ⱑ 5�� ������ �迭�� �����Ͽ�
		//���� �˾Ƽ� �Է��ϰ�
		//�Էµ� ������ ���հ� ����� ���Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		
		//�ٸ� ��� ��1)
		System.out.println("�迭�� ������ �Է����ּ���.");
		int T = scan.nextInt();
		int [] num1 = new int[T];
		System.out.println("");
		//�ٸ� ��� ��2)
		//num1 = new int[5];
		//num1[0] = scan.nextInt();
		//num1[1] = scan.nextInt();
		//num1[2] = scan.nextInt();
		//num1[3] = scan.nextInt();
		//num1[4] = scan.nextInt();
		for(i = 0;i<num1.length;i++) {
			num1[i]=scan.nextInt();
			sum += num1[i];
			
		}	
		
		System.out.println("���� : "+sum);
		System.out.println("��� �� : "+sum/num1.length);
		scan.close();
	}
	
}
