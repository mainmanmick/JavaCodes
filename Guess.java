/*
Guess.java
M McCreary
04.03.2023
*/

public class Guess{

	//data members
	private int userGuess;
	private int secretNumber;
	private String message;

	//Constructor
	public Guess(){
		userGuess=0;
		secretNumber=(int)(Math.random()*10)+1;
		message="";
	}

	//setters
	public void setUserGuess(int userGuess){
		this.userGuess=userGuess;
	}

	//compute
	public void compute(){
		if(userGuess==secretNumber){
			message="Congratulations, you guessed correctly!";
		}
		else if(userGuess>secretNumber){
			message="You guessed too high, sorry!";
		}
		else{
			message="you guessed to low, sorry!";
		}
	}

	//getters
	public String getMessage(){
		return message;
	}

	public int getSecretNumber(){
		return secretNumber;
	}
}









