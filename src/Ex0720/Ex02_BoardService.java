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
		System.out.println("몇번째 글 수정 : ");
		int number = scan.nextInt();
		System.out.println(BoardList.get(number).getBulletinboard());
		System.out.println("비밀 번호를 입력 하시오 : ");
		String pass = scan.next();
		
		for(int i = 0; i<BoardList.size();i++) {
			if(pass.equals(BoardList.get(i).getPassword())) {
				System.out.println("수정 할 내용 입력 하시오.");
				BoardList.get(i).setBulletinboard(scan.next());
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
	}
	
	public void select(List<Ex02_BoardDTO> BoardList) {
		System.out.println("몇번째 글 삭제 : ");
		int number = scan.nextInt();
		System.out.println(BoardList.get(number).getBulletinboard());
		System.out.println("비밀 번호를 입력 하시오 : ");
		String pass = scan.next();
		
		for(int i = 0; i<BoardList.size();i++) {
			if(pass.equals(BoardList.get(i).getPassword())) {
				BoardList.get(i).setBulletinboard("내용이 없습니다");
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
	}
	
}
