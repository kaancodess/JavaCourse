import java.util.Scanner;

public class Login {
	public boolean login(Account account){
		Scanner scan = new Scanner(System.in);
		String username; 
		String password;
		System.out.print("Your username: ");
		username = scan.nextLine();
		System.out.print("Your password: ");
		password = scan.nextLine();
		
		if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
