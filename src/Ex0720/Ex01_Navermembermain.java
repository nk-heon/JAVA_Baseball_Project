package Ex0720;

import java.util.*;

public class Ex01_Navermembermain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//회원 정보를 모두 저장할 ArrayList 선언
		List<Ex01_NavermemberDTO> naverList = new ArrayList<Ex01_NavermemberDTO>();
		//회원 하나의 정보를 담을 DTO 변수 선언
		Ex01_NavermemberDTO naver = null;
		//Service 클래스 객체 선언
		Ex01_NaverService service = new Ex01_NaverService();
		int menu = 0; 
		boolean run = true;
		do {
			System.out.println("------------------------------------");
			System.out.println("1.신규등록 | 2.전체아이디 | 3.전체정보 | 4.종료 ");
			System.out.println("------------------------------------");
			System.out.print("선 택 > ");
			menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("아이디 : ");
				String ID = scan.next();
				
				System.out.print("비밀번호 : ");
				String password = scan.next();
				
				System.out.print("이름 : ");
				String name = scan.next();
				//DTO객체 선언
				naver = new Ex01_NavermemberDTO();
				//객체의 필드값 각각 저장
				naver.setID(ID);
				naver.setPassword(password);
				naver.setName(name);
				//ArrayList에 저장
				naverList.add(naver);
				
				
			}else if(menu == 2 ) {
				// id 출력을 위한 메소드 호출
				service.member(naverList);
			}else if(menu == 3) {
				service.allmember(naverList);
			}else if(menu == 4) {
				run = false;
				System.out.println("종료");
			}
		}
			while(run);

	
	}
	
}
