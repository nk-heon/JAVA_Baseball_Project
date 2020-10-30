package Ex0722;

import java.util.*;

public class Bankservice {
	Scanner scan = new Scanner(System.in);
	
	public void deposit(List<BankDTO> bankList) {
		
		System.out.print("�� ��ȣ �Է� : ");
		int customernumber = scan.nextInt();
		for(int i=0; i < bankList.size(); i++) {
			if(customernumber == bankList.get(i).getCustomer()) {
				System.out.print(bankList.get(i).getCustomer()+" �� ���� ���� �� �ݾ� : ");
				int depositmoney = scan.nextInt();
				if(0<depositmoney) {
					
					int balance = bankList.get(i).getMoney();
					
					bankList.get(i).setMoney(balance + depositmoney);
					System.out.println(bankList.get(i));
					
				}else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}	
			}
		}
		
	}
	public void withdraw(List<BankDTO> bankList) {
		
		System.out.print("�� ��ȣ �Է� : ");
		int customernumber = scan.nextInt();
		for(int i=0; i < bankList.size(); i++) {
			if(customernumber == bankList.get(i).getCustomer()) {
				System.out.print(bankList.get(i).getCustomer()+" �� ���� ��� �� �ݾ� : ");
				int depositmoney = scan.nextInt();
				int balance = bankList.get(i).getMoney();
				if(balance - depositmoney >= 0) {
					bankList.get(i).setMoney(balance - depositmoney);
					System.out.println(bankList.get(i).getMoney());
				}else {
					System.out.println("�ݾ��� �����մϴ�.");
				}
			}
		}
	}
	
	public void ListView(List<BankDTO> bankList) {
		System.out.println("�� ��ȣ �Է� : ");
		int customernumber = scan.nextInt();
		for(int i=0; i < bankList.size(); i++ ) {
			if(customernumber == bankList.get(i).getCustomer()) {
			System.out.println(bankList.get(i).getCustomer()+" �� ���� ���� �ܾ��� " + bankList.get(i).getMoney() + "�Դϴ�.");
			}
		}
	}
	public void AllListView(List<BankDTO> bankList) {
		
		for(int i=0; i < bankList.size(); i++ ) {
			System.out.println(bankList.get(i));
	}
		
	
	
	}
}
