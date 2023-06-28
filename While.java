/*
While.java
M McCreary
07.03.2023
*/


//Application to ask the user for their name, print back their name and ask the user do they want to run the application again
import java.util.*;
public class While{
	public static void main(String args[]){

		//Variables
		String name=""; //input
		boolean repeat=true;
		String runAgain=""; //store the Yes/No

		Scanner keyboard=new Scanner(System.in);
		while(repeat){
			System.out.println("Please enter your name."); //asks the question
			name=keyboard.nextLine(); //store the next string and save it in the Variable

			System.out.println("So your name is "+name); //output - print out the name

			System.out.println("Do you want to run the application again? Please enter Yes or No");
			runAgain=keyboard.nextLine();

			if(runAgain.equalsIgnoreCase("No")){
				repeat=false;
			}

		}
	}
}