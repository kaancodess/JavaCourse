public class Main{
	public static boolean isitPrimeNumber(int number){
		for (int i = 2; i < number;i++) {

			if (number % i == 0) {

				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		for(int i = 2; i < 1000; i++) {

			if (isitPrimeNumber(i)) {

				System.out.println(i);
			}
		}
	}
}