package Ex0710;

public class Ex03_Array_Ascending_Power {

	public static void main(String[] args) {
		
		int[] num = {5,2,4,1,3};
		int temp = 0;
		int i = 0;
		int j = 0;
		
		for(i=0;i<num.length;i++) {
			for(j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
			}
		}
		
		for(i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}