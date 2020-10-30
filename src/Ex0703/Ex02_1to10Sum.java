package Ex0703;

public class Ex02_1to10Sum {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		for(num = 1;num<=10;num++) {
			
			sum = sum + num;
			System.out.print(num);
			if(num<=9) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}
		}	
	}
}