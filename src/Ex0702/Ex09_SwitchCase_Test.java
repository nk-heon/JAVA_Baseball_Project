package Ex0702;

import java.util.Scanner;

public class Ex09_SwitchCase_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
		System.out.print("�ܾ �Է��Ͻÿ�. : ");
		str = scan.next();
		scan.close();
		switch(str){
			case "desk":
				System.out.println("å���Դϴ�.");
				break;
			case "chair":
				System.out.println("�����Դϴ�.");
				break;
			case "mouse":
				System.out.println("���콺�Դϴ�.");
				break;
			default:
				System.out.println("������ ���� �ܾ��Դϴ�.");
				break;
			
			
				
				
		}
	}

}
