package Ex0722;

import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Library_MemberDTO> memberList = new ArrayList<Library_MemberDTO>();
		List<Library_BookDTO> bookList = new ArrayList<Library_BookDTO>();
		LibraryService libraryservice = new LibraryService();
		Library_MemberDTO member = null;
		Library_BookDTO book = null;
		boolean run = true;
		
		
		do {
			System.out.println("----------------------------------------------");
			System.out.println(" 1.회원등록 | 2.도서등록 | 3.도서대출 | 4.도서목록 | 5.종료   ");
			System.out.println("----------------------------------------------");
			System.out.print("선택   > ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				int customer = memberList.size() + 1;
			
				System.out.println("회원번호 : " + customer);
				System.out.print("이름 입력 : ");
				String name = scan.next();
				System.out.print("전화번호 : ");
				String phone = scan.next();
				
				member = new Library_MemberDTO();
				
				member.setCustomer(customer);
				member.setName(name);
				member.setPhone(phone);
				
				memberList.add(member);
				break;
			case 2:
				int booknumber = bookList.size() + 1;
				
				System.out.println("책번호 : " + booknumber);
				System.out.print("도서명 : ");
				String bookname = scan.next();
				System.out.print("저자 : ");
				String author = scan.next();
				
				book = new Library_BookDTO();
				
				book.setBookname(bookname);
				book.setAuthor(author);
				book.setBooknumber(booknumber);
				book.setCheck(true);
				
				bookList.add(book);
				System.out.println();
				break;
			case 3:
				
				libraryservice.bookborrow(memberList, bookList);
				break;
			case 4:
				
				libraryservice.ListView(bookList);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
			
		}while(run);

	}

}
