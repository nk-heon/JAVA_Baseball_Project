package Ex0709;

public class Ex04_Attay_Test02 {

	public static void main(String[] args) {
		//ũ�Ⱑ 5�� ������ �迭�� �����Ͽ�
		//���� �˾Ƽ� �Է��ϰ�
		//�Էµ� ������ ���հ� ����� ���Ͻÿ�.
		int[] number1 = new int[5];
		number1[0] = 1;
		number1[1] = 2;
		number1[2] = 3;
		number1[3] = 4;
		number1[4] = 5;
		int[] number2 = {1,2,3,4,5};
		int sum = 0;
		int avg = 0;
		//�ݺ����� �̿��Ͽ� �迭�� ����
		for(int i =0;i<number1.length; i++) {
		//	sum = sum+1;
		//	sum = sum+2;
		//	sum = sum+3;
		//	sum = sum+4;
		//	sum = sum+5;
			sum = sum + number1[i];
		
		}
		//System.out.println(number1[1]);
		System.out.println(sum);
		avg = sum/number1.length;
		System.out.println(avg);
	}
	
}
