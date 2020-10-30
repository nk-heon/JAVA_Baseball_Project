package Ex0702;

public class Ex06_SwitchCase {

	public static void main(String[] args) {
		/*
		 * Switch Case문
		 * switch(조건변수){
		 * 
		 * case변수값:
		 * 		해당 조건이 맞을 때 실행하는 내용;
		 * 		break;
		 * case변수값:
		 * 		해당 조건이 맞을 때 실행하는 내용;
		 * 		break;
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * default:
		 * 		어떤한 조건도 맞지 않을 때 실행하는 내용;
		 * 		break;
		 * 
		 */
		
		String str = "";
		
		
		str = "다";
		switch(str) {
		case "가":
			System.out.println("num 값이 0 입니다");
			break;
		case "나":
			System.out.println("num 값이 1 입니다");
			break;
		case "다":
			System.out.println("num 값이 2 입니다");
			break;
		default:
			System.out.println("숫자가 아닙니다.");
			break;
		
		}

	}

}
