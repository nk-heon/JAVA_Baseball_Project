package Ex0707;

public class Ex05_While_Dice_Double {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int sum = 0;
		boolean run = true;
		
		while(run) {
			i =(int)(Math.random()*6)+1;
			j =(int)(Math.random()*6)+1;
			sum = i + j;
			System.out.println(i+" + "+j+" = "+ sum);
			
			if(i+j==6) {
				
				run = false;
				
				System.out.println("합이 6이 나왔습니다 종료 합니다");
			}
			
		}

	}

}
