
public class Training {
	private int burpee_number;
	private int pushup_number;
	private int situp_number;
	private int squat_number;
	
	public Training(int burpee_number, int pushup_number, int situp_number, int squat_number) {
		super();
		this.burpee_number = burpee_number;
		this.pushup_number = pushup_number;
		this.situp_number = situp_number;
		this.squat_number = squat_number;
	}

	public int getBurpee_number() {
		return burpee_number;
	}

	public void setBurpee_number(int burpee_number) {
		this.burpee_number = burpee_number;
	}

	public int getPushup_number() {
		return pushup_number;
	}

	public void setPushup_number(int pushup_number) {
		this.pushup_number = pushup_number;
	}

	public int getSitup_number() {
		return situp_number;
	}

	public void setSitup_number(int situp_number) {
		this.situp_number = situp_number;
	}

	public int getSquat_number() {
		return squat_number;
	}

	public void setSquat_number(int squat_number) {
		this.squat_number = squat_number;
	}
	
	public void doExercise(String type_of_exercise,int number) {
		
		if(type_of_exercise.equals("burpee")) {
			
			doBurpee(number);
			
		}else if(type_of_exercise.equals("pushup")) {
			
			doPushup(number);
			
		}else if(type_of_exercise.equals("situp")) {
			
			doSitup(number);
			
		}else if(type_of_exercise.equals("squat")) {
			
			doSquat(number);
		}else {
			System.out.println("Invalid Exercise");
		}
	}
	
	public void doBurpee(int number) {
		
		if(burpee_number == 0) {
			System.out.println("no burpee to do");
			
		}if(burpee_number - number < 0) {
			System.out.println("Congratulations on reaching your target number of burpees.");
			burpee_number = 0;
			System.out.println("Your remaining burpee is " + burpee_number);
		}else {
			burpee_number -= number;
			System.out.println("Your remaining burpee number is " + burpee_number);
		}
		
	}
	
	public void doPushup(int number) {
		
		if(pushup_number == 0) {
			System.out.println("no pushup to do");
			
		}if(pushup_number - number < 0) {
			System.out.println("Congratulations on reaching your target number of pushups");
			pushup_number = 0;
			System.out.println("Your remaining pushup is " + pushup_number);
			
		}else {
			pushup_number -= number;
			System.out.println("Your remaining pushup number is " + pushup_number);
		}
		
	}
	public void doSitup(int number) {
	
		if(situp_number == 0) {
			System.out.println("no situp to do");
			
	}if(situp_number - number < 0) {
		System.out.println("Congratulations on reaching your target number of situps");
		situp_number = 0;
		System.out.println("Your remaining situp is " + situp_number);
		
	}else {
		situp_number -= number;
		System.out.println("Your remaining situp number is " + situp_number);
	}
	
}
	public void doSquat(int number) {
	
	if(squat_number == 0) {
		System.out.println("no squat to do");
		
	}if(squat_number - number < 0) {
		System.out.println("Congratulations on reaching your target number of squats");
		squat_number = 0;
		System.out.println("Your remaining squat is " + squat_number);
		
	}else {
		squat_number -= number;
		System.out.println("Your remaining squat number is " + squat_number);
	}
	
}
	public boolean isTraining_over() {
		return (burpee_number == 0) && (pushup_number == 0 ) && (situp_number == 0) && (squat_number == 0 );
	}
}