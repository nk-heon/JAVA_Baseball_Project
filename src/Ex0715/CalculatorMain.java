package Ex0715;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator Ŭ������ ��ü ����
		Calculator cal = new Calculator();
		cal.sum(7, 5);
		int val1 = 10;
		int val2 = 7;
		cal.sum(val1, val2);
		//double  val3 = 0.5;
		val1 = val2;
		//sum���� int ���� �����ϴµ� double�� �ϸ� ������ �����.�� �� ���� 
		//cal.sum(val1, val3);
		
		//������ ���Ҷ��� �޸� �Ҷ��� �� ��  sum1��ü�� 8�̵ȴ�. 
		cal.sum1(5, 3);
		//�ֿܼ� ����Ʈ�� �Ϸ��� �̿� ����.
		System.out.println(cal.sum1(8,12));	
		int result1 = cal.sum1(7, 10);
		int result2 = result1+10;
		
		System.out.println(result2);
		
	}

}
