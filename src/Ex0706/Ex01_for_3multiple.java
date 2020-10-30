package Ex0706;

public class Ex01_for_3multiple {

	public static void main(String[] args) {

		int i;

		
		i = 0;

		
		for(i=1;i<=100;i++) {
			if(i % 3 == 0 && i % 5 == 0) {	
				System.out.println(i);
			
			}
		}
	}
}
