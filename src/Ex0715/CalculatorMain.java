package Ex0715;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 클래스의 객체 선언
		Calculator cal = new Calculator();
		cal.sum(7, 5);
		int val1 = 10;
		int val2 = 7;
		cal.sum(val1, val2);
		//double  val3 = 0.5;
		val1 = val2;
		//sum에서 int 값을 덧셈하는데 double로 하면 오류가 생긴다.할 수 없음 
		//cal.sum(val1, val3);
		
		//리턴을 안할때와 달리 할때는 이 값  sum1자체가 8이된다. 
		cal.sum1(5, 3);
		//콘솔에 프린트를 하려면 이와 같다.
		System.out.println(cal.sum1(8,12));	
		int result1 = cal.sum1(7, 10);
		int result2 = result1+10;
		
		System.out.println(result2);
		
	}

}
