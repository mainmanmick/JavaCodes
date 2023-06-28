/*
GuessingGameApp.java
M McCreary
01.04.2023
*/

import java.util.*;
public class GuessingGameApp{
	public static void main(String args[]){

		int userGuess1;
		int userGuess2;
		int userGuess3;
		int secretNumber;
		int numOfGuesses;
		String message;


		GuessingGame myGuessingGame=new GuessingGame();
		Scanner keyboard=new Scanner (System.in);

		System.out.println("Please enter your guess for the secret number between 1 and 10");
		userGuess1=keyboard.nextInt();
		myGuessingGame.setUserGuess1(userGuess1);

		System.out.println("Please enter your guess for the secret number between 1 and 10");
		userGuess2=keyboard.nextInt();
		myGuessingGame.setUserGuess2(userGuess2);

		System.out.println("Please enter your guess for the secret number between 1 and 10");
		userGuess3=keyboard.nextInt();
		myGuessingGame.setUserGuess3(userGuess3es);


		myGuessingGame.compute();

		message=myGuessingGame.getMessage();
		System.out.println(message);
		System.out.println("Do you want to play again. eg Yes/No");

	}
}