package Ex0714;

public class Car_Main {

	public static void main(String[] args) {
		/* Car Ŭ������ ��ü�� �����Ͽ�
		 * Car Ŭ������ ������ �ִ� �ʵ带 ���
		 *  * ��ü ������
		 *    '��ü�� ���� Ŭ�����̸�' ������ = new  '��üŬ������ ����������';
		 */
		//CarŬ������ ��ü�� car1�̶�� �̸����� ����
		//car1 : car Ŭ���� Ÿ���� ����
		Car car1 = new Car();//�⺻������
		// Car Ŭ������ ������ �ִ� color �ʵ忡 �� ����
		car1.color = "rad";
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);
		
		String var = "";
		var = car2.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		
		// car3�� ��� �ʵ尪 ���
		System.out.println(car3.color);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);
		//int num;
		//System.out.println(num);
		car3.company = "BMW";
		System.out.println(car3.company);
		
		//�Ű������� �ִ� �����ڸ� Ȱ���� ��ü ����
		Car Car4 = new Car("���̹���");
		//�̷��� CarŬ������ �Ű������� �ִ� �����ڿ� model�� ����.
		System.out.println(Car4.color);
		System.out.println(Car4.company);
		System.out.println(Car4.model);
		System.out.println(Car4.speed);
		System.out.println(Car4.type);
		
	}

}
