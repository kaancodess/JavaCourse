
public class Account {
	private String account_no;
	private double balance;
	private String name;
	private String email;
	private String phone_number;
	
	public Account(){
		System.out.println("Our Constructor");
	}
	
	public Account(String account_no,double balance,String name,String email,String phone_number) {
		this.account_no = account_no;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
	}
	
	
	
	public void deposit(double amount) {
		balance += amount;
		
		System.out.println("New Balance is " + balance);
	}
	
	public void withdraw(double amount) {
		if (amount > 1500) {
			System.out.println("Sorry you can't withdraw 1500 please withdraw lower money");
		}
		if(balance - amount < 0 ) {
			System.out.println("Insufficient balance. your current balance is " + balance);
		}else {
			 balance -= amount;
			 System.out.println("your new balance is " + balance);
		}
	}
	
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
}
