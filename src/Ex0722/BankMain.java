package Ex0722;

import java.util.*;
public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BankDTO> bankList = new ArrayList<BankDTO>();
		Bankservice bankservice = new Bankservice();
		BankDTO bank = null;
		boolean run = true;
		
		
		
		do {
			System.out.println("----------------------------------------------------");
			System.out.println(" 1.����� | 2.���� | 3.��� | 4.�ܾ� | 5.����ü ���� | 6.����  ");
			System.out.println("----------------------------------------------------");
			System.out.print("����   > ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				int customer = bankList.size() + 1;
				
				
				
				System.out.println("����ȣ : " + customer);
				System.out.print("�̸�  : ");
				String name = scan.next();
				System.out.print("���¹�ȣ : ");
				String account = scan.next();
				System.out.print("�ʱ��ܾ� : ");
				int money = scan.nextInt();
				bank = new BankDTO();
				
				bank.setName(name);
				bank.setAccount(account);
				bank.setMoney(money);
				bank.setCustomer(customer);
				
				bankList.add(bank);
				break;
			
			case 2:
				
				bankservice.deposit(bankList);
				
				break;
			
			case 3:
				
				
				bankservice.withdraw(bankList);
				
				break;
			
			case 4:
				
				bankservice.ListView(bankList);
				
				break;
			
			case 5:
				
				bankservice.AllListView(bankList);
				
				break;
				
			case 6:
				run = false;
				System.out.println("�ý��� ����");
				break;
			}
		}while(run);
	}

}
