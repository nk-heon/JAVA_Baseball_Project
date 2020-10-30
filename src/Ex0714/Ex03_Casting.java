package Ex0714;

public class Ex03_Casting {

	public static void main(String[] args) {
		/*
		 *  형변환
		 *  특정 타입의 변수를 다른 타입의 변수로 변환하는 것
		 *  1.자동 형변환
		 *  - 크기가 작은 타입이 큰 타입으로 변환
		 *  2.강제 형변환
		 *  - 크기가 큰 타입이 작은 타입으로 변환 
		 */
		int intvar = 10;
		double doublevar = 1.0;
		//자동형변환 
		System.out.println("자동형변환");
		doublevar = intvar;
		System.out.println(intvar);
		System.out.println(doublevar);
 		
		//강제형변환 (int) 추가
		System.out.println("강제형변환");
		intvar = (int) doublevar;
		System.out.println(intvar);
		System.out.println(doublevar);
	}

}
