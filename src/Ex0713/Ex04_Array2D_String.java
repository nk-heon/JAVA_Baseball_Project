package Ex0713;

import java.util.Scanner;

public class Ex04_Array2D_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] str = {
				{"chair","����"},
				{"desk","å��"},
				{"water","��"},
				{"pencil","����"},
				{"watch","�ð�"}};
		String input = "";
		int i = 0;
		double count = 0;
		
		for(i=0;i<str.length;i++){
				System.out.println("����"+(i+1)+"."+str[i][0]+"�� ���� �����ΰ���?");
				input = scan.nextLine();
				if(str[i][1].equals(input)) {
					System.out.println("����");
					count++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					System.out.println("������"+str[i][1]+"�Դϴ�");
				}
				
		}
		System.out.println("��"+count+"�� �����Դϴ�.");
		System.out.println("�������"+(100*(count/5))+"�Դϴ�");

	}

}
