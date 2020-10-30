package ex0629;

public class ex02_Operator {

	public static void main(String[] args) {
		
		/*    사칙 연산자
		 * 1. 정수형 변수 2개를 선언 
		 * 2. 연산자(+,-,*,/,%)를 활용하여 
		 *    각각 연산을 수행하고 연산결과를 출력하시오.
		 */
		double numder = 0;
		double nam = 0;
		double result = 0;
		
		numder = 10;
		nam = 2;
		
		result = numder + nam;
		System.out.println(result);
		
		result = numder - nam;
		System.out.println(result);
		
		result = numder * nam;
		System.out.println(result);
		
		result = numder / nam;
		System.out.println(result);
		
		result = numder % nam;
		System.out.println(result);
		
		
		
	}

}
