package ex0630;

public class Ex06_If {

	public static void main(String[] args) {
		/*
		 * if (booltype){} ���࿡    
		 * ���� ���ΰ�� ����
		 * else {}�ƴϸ�
		 * ������ ������ ��� ����(���ǽ� �ʿ����)
		 * switch 
		 * case
		 * 
		 * for
		 * while
		 * do~while
		 *
		 */
		System.out.println("if�� ����");
		boolean condition = false;
		if(condition) {
			System.out.println("������ True�� ���Ϳ�.");
		}else {
			System.out.println("������ false�� ���Ϳ�.");
		}
		System.out.println("if�� ��");
	
		int num1 = 0,num2 = 0;
		num1 = 7;
		num2 = 3;
		
		if(num1 > num2) {
			System.out.println("num1��Ů�ϴ�.");
		}else {
			System.out.println("num2�� Ů�ϴ�.");
		}

	}

}
