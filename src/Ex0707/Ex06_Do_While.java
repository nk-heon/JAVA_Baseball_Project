package Ex0707;

public class Ex06_Do_While {

	public static void main(String[] args) {
		/*
		 * do{
		 * 	        반복실행내용
		 * }while(반복조건);
		 */
		int i = 10;
		boolean run = true;
		System.out.println("반복문 시작 전");
		do {
			System.out.println("do while문"+i);
			if(i==99) {
				run = false;
			}
			i++;
			
		}while(run);
		System.out.println("반복문 종료 후");
	}	

}
