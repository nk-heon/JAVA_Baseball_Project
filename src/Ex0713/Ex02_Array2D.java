package Ex0713;

public class Ex02_Array2D {

	public static void main(String[] args) {
		// 2�� 3�� ������ �迭
		int[][] number = new int [2][3];
		// .length �ϸ� �ప�� ��µǼ� 2�����´�. 
		System.out.println(number.length);
		// .length number[0].length ������ ���´�.
		System.out.println(number[0].length);
		System.out.println(number[1].length);
		// 3�� 3��
		int[][] number1 = new int [3][3];
		System.out.println(number1.length);
		//1�� 1,2,3 2��4,5,6�� ����
		
		
		int[][] number2 = {{1,2,3},{4,5,6}};
		
		number[0][0] = 1;
		number[0][1] = 2;
		number[0][2] = 3;
		number[1][0] = 4;
		number[1][1] = 5;
		number[1][2] = 6;
		
		for(int i = 0;i<number2.length;i++) {
			for(int j = 0;j<number2[i].length;j++) {
				System.out.print(number2[i][j]);	
			}
		}
		
		
		String[][] str = {{"��","��","��"},{"��","��","��"},{"��","��","��"}};
		
	
	}

}
