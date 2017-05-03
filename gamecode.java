import java.util.Random;
import java.util.Scanner;

class HelloWorld {
	
		
	public static void selectGame() {
		
		System.out.println("Please select which game you want to play: \nPress 1 to play"
				+ " the fake count game \nPress 2 to play fake or real news game");
		
		//This is where you input the choices
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("You have chosen the fake count game");
			
			//run the fake count method
			fakeOrRealNews();
			
		} else if (choice == 2) {
			System.out.println("You have chosen the fake or real news game");
			
			//run the fake or real news method
			
			
		} else {
			System.out.println("Please enter either 1 or 2 only!");
			
			//If they input an option that is not 1 or 2 it will re-run this method!
			selectGame();
		}
	}
	
	public static void fakeOrRealNews() {
	
		//Create our Arrays here
		String[] randomQuestions = new String[]{
				"A Penny dropped from a 10ft fall can kill a person"
				,"Does oil stop stuck pasta."
				,"Adding Sprinkle of salt can boil the water much quicker"
				,"Dogs sweat by salivating"
				,"Alcohol can decrease your thinking"
				,"Alcohol keeps you warm"
				,"Bulls are colour blind"
				,"Nails and hair keep growing after your death."
				,"Mount Everest is the tallest mountain."
				,"2D animated girls are better than real life girls."};
		
		boolean[] fakeAndReal ={false,false,false,false,true,true,true,false,true,true};
		
		//Present the user with the option to choose number of questions
		System.out.println("Welcome to the Fake or Real news game! \nPlease enter "
				+ "the number of questions (min of 3 and max of 10)");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();				
		
		//This is another person's work that I copied from StackOverflow. All it does really is shuffle the elements in the array
		//This will shuffle the array
		shuffleArray(randomQuestions, fakeAndReal);
		
		//This will be the player's score
		int score = 0;
		
		for(int i = 0; i < choice; i ++) {
			System.out.println(randomQuestions[i]);
			
			Scanner ans = new Scanner (System.in);
			String input = ans.nextLine();
		
			if(input.equals(String.valueOf(fakeAndReal[i]))){
				
				System.out.println("Correct");
				
				//Increase score by 1
				score++;
			} else {
				System.out.println("Wrong");
			}
		}
		System.out.println("Game finished");
		System.out.println("Score is: " + score + " out of " + choice);
	}
	
	  // Implementing Fisher–Yates shuffle
	  static void shuffleArray(String[] question, boolean[] answer)
	  {
	    // If running on Java 6 or older, use `new Random()` on RHS here
	    Random rnd = new Random();
	    for (int i = question.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      String a = question[index];
	      boolean b = answer[index];
	      question[index] = question[i];
	      answer[index] = answer[i];
	      question[i] = a;
	      answer[i] = b;
	    }
	  }
	
	
	public static void main(String [] args){
		
		selectGame();
	}
}
