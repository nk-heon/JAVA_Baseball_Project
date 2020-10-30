package Ex0720;

import java.util.List;
import java.util.*;

public class Ex02_BoardService {
	Scanner scan = new Scanner (System.in);
	
	
	public void member(List<Ex02_BoardDTO> BoardList) {
		for(int i = 0; i<BoardList.size();i++) {
			System.out.println(BoardList.get(i).getBulletinboard());
		}
	}
	
	public void change(List<Ex02_BoardDTO> BoardList) {
		System.out.println("���° �� ���� : ");
		int number = scan.nextInt();
		System.out.println(BoardList.get(number).getBulletinboard());
		System.out.println("��� ��ȣ�� �Է� �Ͻÿ� : ");
		String pass = scan.next();
		
		for(int i = 0; i<BoardList.size();i++) {
			if(pass.equals(BoardList.get(i).getPassword())) {
				System.out.println("���� �� ���� �Է� �Ͻÿ�.");
				BoardList.get(i).setBulletinboard(scan.next());
			}else {
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			}
		}
	}
	
	public void select(List<Ex02_BoardDTO> BoardList) {
		System.out.println("���° �� ���� : ");
		int number = scan.nextInt();
		System.out.println(BoardList.get(number).getBulletinboard());
		System.out.println("��� ��ȣ�� �Է� �Ͻÿ� : ");
		String pass = scan.next();
		
		for(int i = 0; i<BoardList.size();i++) {
			if(pass.equals(BoardList.get(i).getPassword())) {
				BoardList.get(i).setBulletinboard("������ �����ϴ�");
			}else {
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			}
		}
	}
	
}
