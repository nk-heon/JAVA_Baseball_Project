package Ex0730_;

import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		
		CustomerDTO customerDTO = null;
		TestDAO tDAO = new TestDAO();
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("0.DB 접속|1.전체조회|2.고객 등록|3.");
			System.out.println("------------------------------");
			selectNum = scan.nextInt();
			switch(selectNum) {
			case 0:
				tDAO.dbConnection();
				break;
			case 1:
				tDAO.selectALL();
			case 2:
				System.out.println("이름");
				String name = scan.next();
				System.out.println("주소");
				String address = scan.next();
				System.out.println("전화번호");
				String phone = scan.next();
				customerDTO = new CustomerDTO();
				customerDTO.setName(name);
				customerDTO.setAddress(address);
				customerDTO.setPhone(phone);
				
				tDAO.insertCustomer(customerDTO);
			}
		}

}

}