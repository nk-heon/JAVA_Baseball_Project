package Ex0710;

public class Ex01_Array_maximum {

	public static void main(String[] args) {
		
		int[] num = {5,10,3,7,2};
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<num.length;i++) {
			if (max<num[i]){
				max = num[i];
			}else if(min>num[i]) {
				min = num[i];
			}
				
			
		}System.out.println(max);
		System.out.println(min);

	}

}
