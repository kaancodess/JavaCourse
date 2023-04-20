import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Training Program");
		
		String exercises = "Valid exercises...\n"
							+"Burpee\n"
							+"Pushup\n"
							+"Situp\n"
							+"Squat";
		System.out.println(exercises);
		
		System.out.println("Create new Workout");
		
		System.out.println("Enter your burpee number");
		
		int burpee = scan.nextInt();
		
		System.out.println("Enter your situp number");
		
		int situp = scan.nextInt();
		
		System.out.println("Enter your pushup number");
		
		int pushup = scan.nextInt();
		
		System.out.println("Enter your squat number");
		
		int squat = scan.nextInt();
		
		scan.nextLine();
		
		Training training1 = new Training(burpee,situp,pushup,squat);
		
		System.out.println("Your workout is beginning");
		
		while(training1.isTraining_over() == false) {
			
			System.out.println("Type of	exercise (Burpee,Situp,Pushup,Squat)");
			
			String type = scan.nextLine();
			
			System.out.println("How many of these moves will you do?");
			
			int number = scan.nextInt();
			
			scan.nextLine();
			
			training1.doExercise(type, number);
			
		}
	}

}
