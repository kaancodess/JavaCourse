import java.util.Scanner;

public class ATM {
	public void run(Account account) {
		Login login = new Login();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to our bank ");
		System.out.println("**********************");
		System.out.println("User login: ");
		System.out.println("**********************");
		
		int login_right = 3;
		
		while(true) {
			if(login.login(account)) {
				System.out.println("You login succesfully");
				break;
			}else {
				System.out.println("your username or password is wrong please try again");
				login_right -= 1;
				System.out.println("Remain rights: " + login_right);
			}
			if(login_right == 0) {
				System.out.println("Your remain login rights are finish please try again later");
				return;
			}
		}
		System.out.println("*********************");
		
		String Transactions = "Choose your process"
				+"1-Your Balance:\n"
				+"2-Deposit:\n"
				+"3-Withdraw:\n"
				+"3-Press Q to exit:\n";
		System.out.println(Transactions);
		System.out.println("*********************");
		
		while(true) {
			System.out.println("Choose your process");
			String process = scan.nextLine();
			
			if (process.equals("q")) {
				System.out.println("exiting the ATM");
				break;
				
			}else if(process.equals("1")) {
				System.out.println("Your balance is" + account.getBalance());
				
			}else if(process.equals("2")) {
				System.out.println("How much do you want to deposit");
				int amount = scan.nextInt();
				scan.nextLine();
				account.deposit(amount);
				
			}else if(process.equals("3")) {
				System.out.println("How much do you want to withdraw");
				int amount = scan.nextInt();
				scan.nextLine();
				account.withdraw(amount);
				
			}else {
				System.out.println("invalid transaction");	
			}			
		}		
	}
}
