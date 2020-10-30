package Ex0722;

public class BankDTO {

	int customer;
	String name;
	String account;
	int money;
	
	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public BankDTO() {
		
	}
	
	public BankDTO(int customer, String name, String account, int money) {
		super();
		this.customer = customer;
		this.name = name;
		this.account = account;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return " 고객 번호 = " + customer + ", 이름 = " + name + ", 계좌번호 = " + account + ", 금액 = " + money + "]";
	}
	
	
}
