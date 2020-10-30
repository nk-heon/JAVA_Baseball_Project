package Ex0707;

import java.util.Scanner;

public class Ex07_Do_While_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		do {
			
			
			System.out.println("메세지를 입력하세요.");
			System.out.print(">");
			str = scan.next();
			
			System.out.println(str);
		
		//do는 한번만 작동되는데 조건식에 따라 반복작동을 한다.	
		//equals는 문자열에  true , false 를 비교해준다.
		//핵심 while문은  "false" 이 나와야 작동.
		
		}while(!str.equals("종료"));
			System.out.println("프로그램 종료");
			scan.close();		
	}

}
