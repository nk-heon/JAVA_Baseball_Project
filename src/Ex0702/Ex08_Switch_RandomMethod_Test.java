package Ex0702;

public class Ex08_Switch_RandomMethod_Test {

	public static void main(String[] args) {
		int num = 0;
		num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("���� "+num+"���Գ׿�");
			break;
		case 2:
			System.out.println("���� "+num+"���Գ׿�");
			break;
		case 3:
			System.out.println("���� "+num+"���Գ׿�");
			break;
		case 4:
			System.out.println("���� "+num+"���Գ׿�");
			break;
		case 5:
			System.out.println("���� "+num+"���Գ׿�");
			break;
		case 6:
			System.out.println("���� "+num+"���Գ׿�");
			break;
		default:
			System.out.println("���ڰ� �ƴմϴ�.");
			break;
		}

	}

}
