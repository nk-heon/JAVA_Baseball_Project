package Ex0710;

public class Ex04_ForEach {

	public static void main(String[] args) {
		//advanced for(향상된 for)
		//foreach
		int[] num = {1,2,3,4,5};
		for(int i = 0; i<num.length;i++) {
			//System.out.println(num[i]);
		}
		//반복변수 : int A 
		for(int A:num) {
				//반복대상 num
			System.out.println(A);
		}

		
	}

}
