package Ex0723;

public class TryCatch_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 0;
		try {
		int result = num1/num2;
		System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
		}
		
	}
		
	

}
