package Ex0720;

import java.util.*; 

public class Ex02_BoardMain {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//List ������ ��.
		List<Ex02_BoardDTO> BoardList = new ArrayList<Ex02_BoardDTO>();
		
		//���� ���� DTO ���� ����
		Ex02_BoardDTO Board = null;
		
		//service Ŭ���� ����
		Ex02_BoardService service = new Ex02_BoardService();
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.�۾��� |2.��ü �� ��� |3.�ۼ��� |4.�ۻ��� |5.����");
			System.out.println("--------------------------------------");
			System.out.print("�� �� > ");
			int menu = scan.nextInt();
				switch(menu) {
				case 1:
					System.out.print("��й�ȣ �Է� : ");
					String password = scan.next();
					System.out.println("������ �Է��Ͻÿ�.");
					String bulletinboard = scan.next();
					
					
					Board = new Ex02_BoardDTO();
					Board.setPassword(password);
					Board.setBulletinboard(bulletinboard);
					
					BoardList.add(Board);
					break;
				case 2:
					service.member(BoardList);
					break;
				case 3:
					service.change(BoardList);
					break;
				case 4:
					service.select(BoardList);
					break;
				case 5:
					run = false;
					System.out.println("����");
					break;
				
				}
		}	
	} 

}
