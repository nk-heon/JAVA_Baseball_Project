package Ex0710;

public class Ex04_ForEach {

	public static void main(String[] args) {
		//advanced for(���� for)
		//foreach
		int[] num = {1,2,3,4,5};
		for(int i = 0; i<num.length;i++) {
			//System.out.println(num[i]);
		}
		//�ݺ����� : int A 
		for(int A:num) {
				//�ݺ���� num
			System.out.println(A);
		}

		
	}

}
