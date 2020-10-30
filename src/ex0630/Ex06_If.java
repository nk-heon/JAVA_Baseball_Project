package ex0630;

public class Ex06_If {

	public static void main(String[] args) {
		/*
		 * if (booltype){} 만약에    
		 * 조건 참인경우 실행
		 * else {}아니면
		 * 조건이 거짓인 경우 실행(조건식 필요없음)
		 * switch 
		 * case
		 * 
		 * for
		 * while
		 * do~while
		 *
		 */
		System.out.println("if문 시작");
		boolean condition = false;
		if(condition) {
			System.out.println("조건이 True면 나와요.");
		}else {
			System.out.println("조건이 false면 나와요.");
		}
		System.out.println("if문 끝");
	
		int num1 = 0,num2 = 0;
		num1 = 7;
		num2 = 3;
		
		if(num1 > num2) {
			System.out.println("num1이큽니다.");
		}else {
			System.out.println("num2가 큽니다.");
		}

	}

}
