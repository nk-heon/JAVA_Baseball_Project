package Ex0707;

import java.util.Scanner;

public class Ex07_Do_While_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		do {
			
			
			System.out.println("�޼����� �Է��ϼ���.");
			System.out.print(">");
			str = scan.next();
			
			System.out.println(str);
		
		//do�� �ѹ��� �۵��Ǵµ� ���ǽĿ� ���� �ݺ��۵��� �Ѵ�.	
		//equals�� ���ڿ���  true , false �� �����ش�.
		//�ٽ� while����  "false" �� ���;� �۵�.
		
		}while(!str.equals("����"));
			System.out.println("���α׷� ����");
			scan.close();		
	}

}
