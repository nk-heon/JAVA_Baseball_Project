package Ex0702;

public class Ex08_Switch_RandomMethod_Test {

	public static void main(String[] args) {
		int num = 0;
		num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("숫자 "+num+"나왔네요");
			break;
		case 2:
			System.out.println("숫자 "+num+"나왔네요");
			break;
		case 3:
			System.out.println("숫자 "+num+"나왔네요");
			break;
		case 4:
			System.out.println("숫자 "+num+"나왔네요");
			break;
		case 5:
			System.out.println("숫자 "+num+"나왔네요");
			break;
		case 6:
			System.out.println("숫자 "+num+"나왔네요");
			break;
		default:
			System.out.println("숫자가 아닙니다.");
			break;
		}

	}

}
