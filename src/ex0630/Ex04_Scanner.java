package ex0630;

import java.util.Scanner;

public class Ex04_Scanner {

	public static void main(String[] args) {
		
		// ��ĳ�� ����� ���� ��ĳ�� ��ü ����
		Scanner scan = new Scanner(System.in);
		//�ܼ�â���� �̸�. ��ȣ�� �Է¹޾Ƽ�
		// �Է¹��� ���� �״�� ���
		// �̸�, �ּ� �Է��� ���� ���� ����
		String name,address;
		//name = scan.nextLine();
		//scan.next(); �����̽��� ��������.
		//scan.nextLine(); �����̽��� ���ڷ� �ν���.
		System.out.print("�̸��� �Է��ϼ��� : ");
		// ��ĳ�ʷ� �Է¹��� ������ name ������ ����
		// �º� : name
		// �캯 : ��ĳ�� �Է��� ó�����ִ� ����
		name = scan.nextLine();
		// name ������ ��� �ִ� �� ���
		System.out.println("�Է��� �̸� : " + name);
		
		System.out.print("�ּ��� �Է��ϼ��� : ");
		address = scan.nextLine();
		System.out.println("�Է��� �ּ�:" + address);
		
		int age = 0;
		
		System.out.print("���̸� �Է��ϼ��� :");
		
		age = scan.nextInt();
		System.out.print("�Է��� ���� : " +age);
		
		scan.close();
	}

}
