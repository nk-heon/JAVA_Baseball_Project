package ex0630;

import java.util.Scanner;

public class Ex04_Scanner {

	public static void main(String[] args) {
		
		// 스캐너 사용을 위한 스캐너 객체 선언
		Scanner scan = new Scanner(System.in);
		//콘솔창에서 이름. 주호를 입력받아서
		// 입력받은 값을 그대로 출력
		// 이름, 주소 입력을 위한 변수 선언
		String name,address;
		//name = scan.nextLine();
		//scan.next(); 스페이스는 먹지않음.
		//scan.nextLine(); 스페이스도 문자로 인식함.
		System.out.print("이름을 입력하세요 : ");
		// 스캐너로 입력받은 내용을 name 변수에 저장
		// 좌변 : name
		// 우변 : 스캐너 입력을 처리해주는 내용
		name = scan.nextLine();
		// name 변수에 들어 있는 값 출력
		System.out.println("입력한 이름 : " + name);
		
		System.out.print("주소을 입력하세요 : ");
		address = scan.nextLine();
		System.out.println("입력한 주소:" + address);
		
		int age = 0;
		
		System.out.print("나이를 입력하세요 :");
		
		age = scan.nextInt();
		System.out.print("입력한 나이 : " +age);
		
		scan.close();
	}

}
