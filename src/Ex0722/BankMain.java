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
			System.out.println(" 1.고객등록 | 2.예금 | 3.출금 | 4.잔액 | 5.고객전체 정보 | 6.종료  ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택   > ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				int customer = bankList.size() + 1;
				
				
				
				System.out.println("고객번호 : " + customer);
				System.out.print("이름  : ");
				String name = scan.next();
				System.out.print("계좌번호 : ");
				String account = scan.next();
				System.out.print("초기잔액 : ");
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
				System.out.println("시스템 종료");
				break;
			}
		}while(run);
	}

}
