package Ex0707;

public class Ex03_While_break {

	public static void main(String[] args) {

		int i = 1;
		boolean run = true;
		while(run) {	
		System.out.println(i);	
		
		if(i==99) {
			run = false;
		}
		i++;
		}

	}

}
