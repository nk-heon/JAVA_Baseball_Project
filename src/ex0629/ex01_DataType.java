package ex0629;

public class ex01_DataType {

	public static void main(String[] args) {
		// 데이터 타입
		/* 정수형
		 * **int = (4byte, 4B) : -2147483648 ~ 2147483647
		 * *long = (8byte, 8B) : 2^63 저장공간을 두배로 먹음.
		 * byte = (1byte, 1B) : -128 ~ 127
		 * char = 
		 * short
		*/
		/* 실수형
		 * flort
		 * *double
		 */
		/*
		 * 논리형
		 * **boolean : true,false
		 */
		//byte 타입변수
		byte byteVar;
		byteVar = -128;
		System.out.println(byteVar);
		
		long longVar;
		longVar = 10000000L;
		System.out.println(longVar);
		
		char charVar;
		charVar = 48;
		charVar = 'a';
		System.out.println(charVar);
		//char는 숫자로 하면 아스키코드로 표현 
		
		double doublevar;
		doublevar = 1.123123;
		System.out.println(doublevar);
		
		float floatvar;
		floatvar = 1.125123f;
		System.out.println(floatvar);
		
		// bool type 변수,논리형 변수
		boolean boolvar;
		boolvar = true;
		boolvar = false;
		System.out.println(boolvar);
		
		/*
		 * 변수를 활용한 간단한 계산
		 * 1. 정수형 변수 number를 선언하여 정수 대입
		 * 2. 정수형 변수 result 선언
		 * 3. number에 10을 더하여 result변수에 대입
		 * 4. result 변수가 가지고 있는 값 출력
		 */
		int numdar = 0;
		int result = 0;
		
		numdar = 10;
		
		result = numdar+10;
		
		System.out.println(result);
		
		
		 
	}

}
