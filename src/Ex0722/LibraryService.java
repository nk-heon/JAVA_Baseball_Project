package Ex0722;

import java.util.*;
public class LibraryService {
	
	Scanner scan = new Scanner(System.in);
	public List<Library_BookDTO> bookborrow(List<Library_MemberDTO> memberList,List<Library_BookDTO> bookList) {
	
		System.out.print("고객번호 > ");
		int member = scan.nextInt();
		
		for(int i = 0; i < memberList.size();i++) {
			if(member == memberList.get(i).getCustomer()) {
				int memmain = memberList.get(i).getCustomer();
				System.out.println(memmain);
				
			}else {
				System.out.println("없는 고객 번호입니다.");
			}
		}
		System.out.print("빌릴 책 번호 > ");
		int booknumber = scan.nextInt();
		
		for(int j = 0; j < bookList.size();j++) {
			if(booknumber == bookList.get(j).getBooknumber()) {
				int bookmain = bookList.get(j).getBooknumber();
				System.out.println(bookmain);
				
			}else {
				System.out.println("없는  번호입니다.");
			}
		}
		return bookList;
		
		
		
		
		
		
	}
	public void ListView(List<Library_BookDTO> bookList) {
		for(int i = 0; i<bookList.size();i++)
		System.out.println(bookList.get(i));
	}

}
