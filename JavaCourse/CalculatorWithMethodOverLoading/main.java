import java.util.Scanner;

public class Main {
	public static int sum(int number1, int number2) {
		return (number1 + number2);
	}
	public static int subtraction(int number1, int number2) {
		return (number1 - number2);
	}
	public static int multiplication(int number1, int number2) {
		return number1 * number2;
	}
	public static int sum(int number1, int number2, int number3) {
		return (number1 + number2 + number3);
	}
	public static int multiplication(int number1, int number2, int number3) {
		return number1 * number2 * number3;
	}
	public static double division(int number1, int number2) {
		return ((double)number1 / number2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Transactions = "1-Sum:\n"
							+"2-Subtraction:\n"
							+"3-Multiplication:\n"
							+"4-Divison:\n"
							+"Press Q to exit";
		System.out.println("*********************************");
		System.out.println(Transactions);
		System.out.println("*********************************");

		while (true){
			System.out.println("Choose your process");
			String process = scan.nextLine();

			if (process.equals("q")){
				System.out.println("Exiting the program..");
				break;

			}

			else if(process.equals("1")) {
				System.out.println("How many number will you sum ? (2 or 3) ");

				int how_many_numbers = scan.nextInt();

				if (how_many_numbers == 2) {
					System.out.println("Number1: ");
					int number1 = scan.nextInt();
					System.out.println("Number2: ");
					int number2 = scan.nextInt();
					System.out.println("The sum is: " + (sum(number1,number2)));
					scan.nextLine();

				}else if (how_many_numbers == 3) {
					System.out.println("Number1: ");
					int number1 = scan.nextInt();
					System.out.println("Number2: ");
					int number2 = scan.nextInt();
					System.out.println("Number3: ");
					int number3 = scan.nextInt();
					System.out.println("The sum is: " + (sum(number1,number2,number3)));

				}else {
					System.out.println("there is no suitable method for this");
				}

			}else if (process.equals("2")){
					System.out.println("Number1: ");
					int number1 = scan.nextInt();
					System.out.println("Number2: ");
					int number2 = scan.nextInt();
					System.out.println("The subtraction is " + (subtraction(number1,number2)));

			}else if (process.equals("3")){
				System.out.println("How many number will you multiplication ? (2 or 3) ");

				int how_many_numbers = scan.nextInt();

				if (how_many_numbers == 2) {
					System.out.println("Number1: ");
					int number1 = scan.nextInt();
					System.out.println("Number2: ");
					int number2 = scan.nextInt();
					System.out.println("The sum is: " + (multiplication(number1,number2)));
					scan.nextLine();

				}else if (how_many_numbers == 3) {
					System.out.println("Number1: ");
					int number1 = scan.nextInt();
					System.out.println("Number2: ");
					int number2 = scan.nextInt();
					System.out.println("Number3: ");
					int number3 = scan.nextInt();
					System.out.println("The sum is: " + (multiplication(number1,number2,number3)));

				}else {
					System.out.println("there is no suitable method for this");
				}


			}else if (process.equals("4")) {
					System.out.println("Number1: ");
					int number1 = scan.nextInt();
					System.out.println("Number2: ");
					int number2 = scan.nextInt();
					System.out.println("The division is" + (division(number1,number2)));
			}
		}
	}
}