package Ex0707;

public class Ex04_While_Dice {

	public static void main(String[] args) {
		int i = 1;
		boolean run = true;
		
		while(run) {
			System.out.println("����  : "+i);
		
			if(i==6) {
				run = false;
			}
			
			i = (int)(Math.random()*6);
			i++;
		
		}System.out.println("6�� ���Գ׿� �����մϴ�");

	}

}
