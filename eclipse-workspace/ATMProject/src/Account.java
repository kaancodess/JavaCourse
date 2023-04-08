
public class Account {
	private String username;
	private String password;
	private int balance;
	
	
	public Account(String username, String password, int balance) {
		this.username = username;
		this.password = password;
		this.balance = balance;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
			balance += amount;
			System.out.println("Your new balance is: " + balance);
		}
	
	public void withdraw(int amount) {
		
		if (balance - amount < 0) {
			System.out.println("Insufficient balance");
		}else {
			balance -= amount;
			System.out.println("Your new balance is: " + balance);
		}
	}
	
	
	
	
	
}
