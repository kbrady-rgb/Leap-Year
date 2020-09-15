import java.util.Scanner;

public class LeapYear {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		try {
			boolean isLeapYear = false; //Creates a boolean to act like a flag
			System.out.println("Enter a year:"); //Prompts user to enter a year
			Scanner input = new Scanner(System.in); //Creates a new scanner to read user input
			
			int guess = input.nextInt(); //Assigns user input to guess
		
			while(!isLeapYear) //continue to loop while isLeapYear remains false
			{
				if(guess%4 == 0 && guess%100 != 0) { //if year is evenly divisible by 4 and NOT evenly divisible by 100
					isLeapYear = true; //sets the flag to true
					if(isLeapYear == true) { //if the flag is true
						System.out.println(guess + " is a leap year."); //tell the user that the year is a leap year
					}
				}
				else { 
					System.out.println(guess + " is not a leap year."); //tell the user that the year is not a leap year
					guess = input.nextInt(); //loop until user inputs a leap year
				}
			}
		}
		catch(Exception ex){ //catches any exceptions
			System.out.println("Something went wrong. Did you input a year?");
		}
	}
}

