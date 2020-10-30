package Ex0715_problem;

public class Calculator {
	//add메소드, 리턴타입 : int, 매개변수 : 정수 x,y
	int add(int x, int y) {
		
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = add(x, y);
		double result = sum/2;
		return result;
		
	}
	
	void execute() {
		double result = avg(7,10);
		System.out.println("실행결과:"+result);
		
	}
}
