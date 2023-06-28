/*
DoWhile.java
M McCreary
07.03.2023
*/


//Application to ask the user for their name, print back their name and ask the user do they want to run the application again
import java.util.*;
public class DoWhile{
	public static void main(String args[]){

		//variables
		String name=""; //input
		String repeat=""; //store the Yes/No
		//object
		Scanner keyboard=new Scanner(System.in);
		do{
			System.out.println("Please enter your name."); //asks the question
			name=keyboard.nextLine(); //store the next string and save it in the Variable

			System.out.println("So your name is "+name); //output - print out the name

			System.out.println("Do you want to run the application again? Please enter Yes or No");
			repeat=keyboard.nextLine();
		}
		while(repeat.equalsIgnoreCase("Yes")); //While the answer is equal to yes, repeat the loop

	} //close main method
} //close class signature