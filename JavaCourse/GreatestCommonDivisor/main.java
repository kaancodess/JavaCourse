import java.util.Scanner;

public class Main{
	public static int findGCD(int number1 ,int number2){
		int gcd = 1;

		for (int i = 1; i <= number1 && i <= number2 ; i++){
			if ((number1 % i == 0) && (number2 % i == 0)) {
				gcd = i;
			}
		}
		return gcd;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Number 1: ");
		int gcd_number1 = scan.nextInt();
		System.out.println("Number 2: ");
		int gcd_number2 = scan.nextInt();
		System.out.println("Greatest common divisor is: " + findGCD(gcd_number1,gcd_number2));

	}
}