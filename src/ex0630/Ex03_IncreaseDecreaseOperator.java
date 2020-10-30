package ex0630;

public class Ex03_IncreaseDecreaseOperator {

	public static void main(String[] args) {
		// 증감연산자 (++,--)
		/*
		 * ++:기존 변수가 가지고 있는 값에 1을 더함.
		 * --:기존 변수가 가지고 있는 값에 1을 뺌.
		 * 정수형 변수 num = 5 이 있다면
		 * num++ :num이 가지고 있는 값을 사용한 후
		 * 		  num값을 1증가(num=6 이됨)
		 * ++num :num이 가지고 있는 값에 1을 더한 후
		 * 		  계산에 활용(num=6)
		 */

		int num1 = 5;
		//int num2 = 0;
		int num3 = 0;
		
		System.out.println("num1 : "+num1);
		System.out.println("num3 : "+num3);
		
		num3 = num1++;
		System.out.println("num1 : "+num1);
		System.out.println("num3 : "+num3);
		
		num3 = num1++;
		System.out.println("num1 : "+num1);
		System.out.println("num3 : "+num3);
		
		
		
	}

}
		
