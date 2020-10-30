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
			System.out.println("0.DB ����|1.��ü��ȸ|2.�� ���|3.");
			System.out.println("------------------------------");
			selectNum = scan.nextInt();
			switch(selectNum) {
			case 0:
				tDAO.dbConnection();
				break;
			case 1:
				tDAO.selectALL();
			case 2:
				System.out.println("�̸�");
				String name = scan.next();
				System.out.println("�ּ�");
				String address = scan.next();
				System.out.println("��ȭ��ȣ");
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