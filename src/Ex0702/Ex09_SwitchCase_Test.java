package Ex0702;

import java.util.Scanner;

public class Ex09_SwitchCase_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
		System.out.print("단어를 입력하시오. : ");
		str = scan.next();
		scan.close();
		switch(str){
			case "desk":
				System.out.println("책상입니다.");
				break;
			case "chair":
				System.out.println("의자입니다.");
				break;
			case "mouse":
				System.out.println("마우스입니다.");
				break;
			default:
				System.out.println("사전에 없는 단어입니다.");
				break;
			
			
				
				
		}
	}

}
