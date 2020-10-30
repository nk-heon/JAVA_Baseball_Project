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
			System.out.println(" 1.ȸ����� | 2.������� | 3.�������� | 4.������� | 5.����   ");
			System.out.println("----------------------------------------------");
			System.out.print("����   > ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				int customer = memberList.size() + 1;
			
				System.out.println("ȸ����ȣ : " + customer);
				System.out.print("�̸� �Է� : ");
				String name = scan.next();
				System.out.print("��ȭ��ȣ : ");
				String phone = scan.next();
				
				member = new Library_MemberDTO();
				
				member.setCustomer(customer);
				member.setName(name);
				member.setPhone(phone);
				
				memberList.add(member);
				break;
			case 2:
				int booknumber = bookList.size() + 1;
				
				System.out.println("å��ȣ : " + booknumber);
				System.out.print("������ : ");
				String bookname = scan.next();
				System.out.print("���� : ");
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
				System.out.println("���α׷� ����");
				break;
			}
			
		}while(run);

	}

}
