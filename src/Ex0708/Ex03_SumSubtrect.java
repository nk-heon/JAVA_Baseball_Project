package Ex0708;

public class Ex03_SumSubtrect {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int count = 1;
		int s = 1;
		boolean run = true; 

		while(run) {
			sum = sum + num;
			if(sum>=100) {
				run = false;
			}else {
				num = s * count;
				s = -s;
				System.out.println(s);
				count++;
			}
		}
		System.out.println(num);
	}

}
