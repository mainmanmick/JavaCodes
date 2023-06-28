/*
GuessingGame.java
M McCreary
01.04.2023
*/

import java.util.Random;
public class GuessingGame{

	//data members
	private int userGuess1;
	private int userGuess2;
	private int userGuess3;
	private int secretNo;
	private int numOfGuesses;
	private String message;
	private String playAgain;

	//Constructor
	public GuessingGame(){
		userGuess1=0;
		userGuess2=0;
		userGuess3=0;
		secretNo=(int)(Math.random()*10)+1;
		message="";
		numOfGuesses=0;
		playAgain="";
	}

	//setters
	public void setUserGuess1(int userGuess1){
		this.userGuess1=userGuess1;
	}

	public void setUserGuess2(int userGuess2){
			this.userGuess2=userGuess2;
	}

	public void setUserGuess3(int userGuess3){
			this.userGuess3=userGuess3;
	}

	public void setPlayAgain(String playAgain){
				this.playAgain=playAgain;
	}

	//compute
	public void compute(){
		numOfGuesses++;
		if(userGuess1==secretNo||userGuess2==secretNo||userGuess3==secretNo){
			message="Congratulations, you guessed correctly!";
		}
		else if(userGuess1>secretNo||userGuess2>secretNo||userGuess3>secretNo){
			message="You guessed too high, sorry!";
		}
		else{
			message="you guessed to low, sorry!";
		}
		if(numOfGuesses<=3){
			message+= " The secret number was "+secretNo;
		}

	}

	//getters
	public String getMessage(){
		return message;
	}

	public int getSecretNo(){
		return secretNo;
	}
}









