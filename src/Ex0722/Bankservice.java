package Ex0722;

import java.util.*;

public class Bankservice {
	Scanner scan = new Scanner(System.in);
	
	public void deposit(List<BankDTO> bankList) {
		
		System.out.print("고객 번호 입력 : ");
		int customernumber = scan.nextInt();
		for(int i=0; i < bankList.size(); i++) {
			if(customernumber == bankList.get(i).getCustomer()) {
				System.out.print(bankList.get(i).getCustomer()+" 번 고객님 예금 할 금액 : ");
				int depositmoney = scan.nextInt();
				if(0<depositmoney) {
					
					int balance = bankList.get(i).getMoney();
					
					bankList.get(i).setMoney(balance + depositmoney);
					System.out.println(bankList.get(i));
					
				}else {
					System.out.println("잘못 입력했습니다.");
				}	
			}
		}
		
	}
	public void withdraw(List<BankDTO> bankList) {
		
		System.out.print("고객 번호 입력 : ");
		int customernumber = scan.nextInt();
		for(int i=0; i < bankList.size(); i++) {
			if(customernumber == bankList.get(i).getCustomer()) {
				System.out.print(bankList.get(i).getCustomer()+" 번 고객님 출금 할 금액 : ");
				int depositmoney = scan.nextInt();
				int balance = bankList.get(i).getMoney();
				if(balance - depositmoney >= 0) {
					bankList.get(i).setMoney(balance - depositmoney);
					System.out.println(bankList.get(i).getMoney());
				}else {
					System.out.println("금액이 부족합니다.");
				}
			}
		}
	}
	
	public void ListView(List<BankDTO> bankList) {
		System.out.println("고객 번호 입력 : ");
		int customernumber = scan.nextInt();
		for(int i=0; i < bankList.size(); i++ ) {
			if(customernumber == bankList.get(i).getCustomer()) {
			System.out.println(bankList.get(i).getCustomer()+" 번 고객님 현재 잔액은 " + bankList.get(i).getMoney() + "입니다.");
			}
		}
	}
	public void AllListView(List<BankDTO> bankList) {
		
		for(int i=0; i < bankList.size(); i++ ) {
			System.out.println(bankList.get(i));
	}
		
	
	
	}
}
