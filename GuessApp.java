/*
GuessApp.java
M McCreary
04.03.2023
*/

import javax.swing.JOptionPane;
public class GuessApp{
	public static void main(String args[]){

		int userGuess;
		int secretNumber;

		Guess myGuess=new Guess();

		userGuess=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your guess for the secret number between 1 and 10"));

		myGuess.setUserGuess(userGuess);
		myGuess.compute();

		JOptionPane.showMessageDialog(null, myGuess.getMessage());
		JOptionPane.showMessageDialog(null,"The secret number was: "+myGuess.getSecretNumber());

	}
}