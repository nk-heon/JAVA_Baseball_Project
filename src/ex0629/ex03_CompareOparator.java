package ex0629;

public class ex03_CompareOparator {

	public static void main(String[] args) {
		//�񱳿�����
		/*<= �۰ų� ����.
		 *>= ũ�ų� ����.
		 *== ����.
		 *!= �ٸ���.
		*/
		
		int num1 = 0;
		int num2 = 0;
		
		num1 = 9;
		num2 = 6;
		
		System.out.println(num1 >= num2);
		
		boolean result = false;
		result = num1 >= num2;
		System.out.println(result);
		
		boolean result1 = false;
		String str1 = "java";
		String str2 = "JAVA";
		result1 = str1.equals(str2);
		System.out.println(result1);
		
	}

}
