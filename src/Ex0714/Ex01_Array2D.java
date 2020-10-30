package Ex0714;

import java.util.Scanner;

public class Ex01_Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//정수형 배열 num 이름만 선언(완전한 배열로 선언된 것은 아님)
		int[] num = null;
		//num을 출력하면 지정된 값이 없어 오류 메시지가 뜬다.
		//System.out.println(num.length);
		//스캐너 입력을 통해 사이즈 지정
		System.out.println("지정할 배열 크기");
		int size = scan.nextInt();
		//입력받은 숫자를 배열 크기에 지정
		num = new int[size];
		//int[] num1 = new int[5];
		System.out.println(num.length);
		
		//참고 !!!!! 
		//전역변수와 지역변수를 구분해서 코딩 할것 !!
		//전역변수는 함수밖에서 변수나 값을 입력하여 전체 함수에 쓸수 있도록 한다.
		//지역변수는 함수안에 변수나 값을 입력하여 그 함수 안에서만 쓸수 있다.
	}

}
