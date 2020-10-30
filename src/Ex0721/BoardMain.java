package Ex0721;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		BoardService boardService = new BoardService();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�۾��� | 2.��ü ��� | 3.�ۼ��� | 4.�ۻ��� | 5.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("���� : ");
				String title = scan.next();
				System.out.print("���� : ");
				String contents = scan.next();
				System.out.print("��й�ȣ : ");
				String password = scan.next();
				board = new BoardDTO();
				board.setTitle(title);
				board.setContents(contents);
				board.setPassword(password);
				
				int bnumber = boardList.size() + 1;
				board.setBnumber(bnumber);
				
				boardList.add(board);
				
				break;
			case 2:
				boardService.listView(boardList);
				break;
			case 3:
				boardList = boardService.boardModify(boardList);
				break;
			case 4: 
				boardList = boardService.boardDelete(boardList);
				break;
			}
		}
		
	}
}