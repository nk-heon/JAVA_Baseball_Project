package ex0630;

public class Ex02_LogicalOperator {

	public static void main(String[] args) {
		/*
		 * ��������
		 * &&(AND ����) : A && B �϶� A, B ��� true ���� ����� true
		 * 		A , B�߿� �ϳ��� false�� �ִٸ� ����� false
		 * ||(OR ����) : A || B�� ��  A, B �߿� �ϳ��� true�� ����� true
		 * 		A, B ��� false���� ����� false
		 * !(NOT ����) : boolean ���� �տ� ����ϸ� ��� ����
		 */
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		//AND ����
		var3 = var1 && var2;
		System.out.println(var3);
		
		var1 = true;
		var3 = var1 && var2;
		System.out.println(var3);
		
		var2 = true;
		var3 = var1 && var2;
		System.out.println(var3);
		
		var3 = (7>3)&&(3<1);
		System.out.println(var3);
		
		//OR ����
		
		var3 = var1 || var2;
		System.out.println(var3);
		
		var1 = false;
		var3 = var1 || var2;
		System.out.println(var3);
		
		// NOT ����
		
		System.out.println(var2);
		
		var2 = !var2;
		
		System.out.println(var2);
	}

}
