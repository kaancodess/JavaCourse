
public class Main {

	public static void main(String[] args) {
		Account account1 = new Account("Kaan Guzel","kaancodes@gmail.com","145321141");
		
		Account account2 = account1;
		
		Account account3 = new Account();
		
		/*if(account1 == account3) {
			System.out.println("they are showing same object");
		}else {
			System.out.println("they aren't showing same object");
		}*/
		
		new Account("Michael","Michael123@gmail.com","125241").show_information();
	}

}
