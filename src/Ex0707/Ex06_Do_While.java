package Ex0707;

public class Ex06_Do_While {

	public static void main(String[] args) {
		/*
		 * do{
		 * 	        �ݺ����೻��
		 * }while(�ݺ�����);
		 */
		int i = 10;
		boolean run = true;
		System.out.println("�ݺ��� ���� ��");
		do {
			System.out.println("do while��"+i);
			if(i==99) {
				run = false;
			}
			i++;
			
		}while(run);
		System.out.println("�ݺ��� ���� ��");
	}	

}
