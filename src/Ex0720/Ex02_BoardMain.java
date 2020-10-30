package Ex0720;

import java.util.*; 

public class Ex02_BoardMain {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//List 저장할 곳.
		List<Ex02_BoardDTO> BoardList = new ArrayList<Ex02_BoardDTO>();
		
		//정보 담을 DTO 변수 선언
		Ex02_BoardDTO Board = null;
		
		//service 클래스 선언
		Ex02_BoardService service = new Ex02_BoardService();
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.글쓰기 |2.전체 글 출력 |3.글수정 |4.글삭제 |5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선 택 > ");
			int menu = scan.nextInt();
				switch(menu) {
				case 1:
					System.out.print("비밀번호 입력 : ");
					String password = scan.next();
					System.out.println("내용을 입력하시오.");
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
					System.out.println("종료");
					break;
				
				}
		}	
	} 

}
