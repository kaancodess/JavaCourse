public class Main{
	
	public static void CalculateScore(String name,int point){
		System.out.println(name + " has " + point + " points");
	}
	public static void CalculateScore(String name){
		System.out.println(name + " has no points");
	}
	public static void CalculateScore(int point){
		System.out.println("Nameless player has " + point);
	}

	/*public static void sum(String a,String b){
		System.out.println(a + " " + b);
	}
	public static void sum(int a,int b){
		System.out.println("Sum of numbers:" + (a+b));
	}
	public static void sum(int a,int b,int c){
		System.out.println("Sum of numbers: " + (a+b+c));
	}*/

	public static void main(String args[]){
		/*sum(3,4,5);
		// sum(3,4); // required 3 integer but i gave 2 integer to the method and i need to write a another method
		//---------------------------------------------------------------//
		sum(3,5); // and now it works because i wrote the same method but i give 2 integer instead of 3 integer
		sum("James","Gosling");*/
		CalculateScore("Tom",720);
		CalculateScore(900);
		CalculateScore("Rachel"); // we can use same method with different kind of ways
	}
}