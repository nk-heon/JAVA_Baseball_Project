package ex0629;

public class ex01_DataType {

	public static void main(String[] args) {
		// ������ Ÿ��
		/* ������
		 * **int = (4byte, 4B) : -2147483648 ~ 2147483647
		 * *long = (8byte, 8B) : 2^63 ��������� �ι�� ����.
		 * byte = (1byte, 1B) : -128 ~ 127
		 * char = 
		 * short
		*/
		/* �Ǽ���
		 * flort
		 * *double
		 */
		/*
		 * ����
		 * **boolean : true,false
		 */
		//byte Ÿ�Ժ���
		byte byteVar;
		byteVar = -128;
		System.out.println(byteVar);
		
		long longVar;
		longVar = 10000000L;
		System.out.println(longVar);
		
		char charVar;
		charVar = 48;
		charVar = 'a';
		System.out.println(charVar);
		//char�� ���ڷ� �ϸ� �ƽ�Ű�ڵ�� ǥ�� 
		
		double doublevar;
		doublevar = 1.123123;
		System.out.println(doublevar);
		
		float floatvar;
		floatvar = 1.125123f;
		System.out.println(floatvar);
		
		// bool type ����,���� ����
		boolean boolvar;
		boolvar = true;
		boolvar = false;
		System.out.println(boolvar);
		
		/*
		 * ������ Ȱ���� ������ ���
		 * 1. ������ ���� number�� �����Ͽ� ���� ����
		 * 2. ������ ���� result ����
		 * 3. number�� 10�� ���Ͽ� result������ ����
		 * 4. result ������ ������ �ִ� �� ���
		 */
		int numdar = 0;
		int result = 0;
		
		numdar = 10;
		
		result = numdar+10;
		
		System.out.println(result);
		
		
		 
	}

}
