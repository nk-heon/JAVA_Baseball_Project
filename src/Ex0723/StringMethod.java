package Ex0723;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100";
		int num = 100;
		int result = 0;
		//String을 int로 넘겨서 int로 만들수있습니다. 단!! Str
		//ing에서는 숫자만을 기입해야만 한다.
		int num1 = Integer.parseInt(str);
		result = num + num1;
		System.out.println(result);
	}

}
