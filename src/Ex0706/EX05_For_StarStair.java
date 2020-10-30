package Ex0706;

public class EX05_For_StarStair {

	public static void main(String[] args) {
	int i = 0;
	int j = 0;
	int k = 0;
		for(i = 1;i<=10;i++) {
			if(i<=5) {
				for(j = 2;j<=i;j++) {
					System.out.print("*");
				}
			}else if(i<=10) {
				for(k = 7;k<=i;k++) {
					System.out.print("*");
				}
					
			}
					System.out.println("*");
			
			
		}
		

	}

}
