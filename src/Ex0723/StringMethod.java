package Ex0723;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100";
		int num = 100;
		int result = 0;
		//String�� int�� �Ѱܼ� int�� ������ֽ��ϴ�. ��!! Str
		//ing������ ���ڸ��� �����ؾ߸� �Ѵ�.
		int num1 = Integer.parseInt(str);
		result = num + num1;
		System.out.println(result);
	}

}
