/*
CharacterSwapApp.Java
M McCreary
09.04.2023
*/

import java.util.*;
public class CharacterSwapApp{
	public static void main(String args[]){

		String word;
		String newWord;

		Scanner keyboard=new Scanner(System.in);
		CharacterSwap myCharacterSwap=new CharacterSwap();

		System.out.println("Please enter a word. ie Laptop");
		word=keyboard.nextLine();
		myCharacterSwap.setWord(word);

		myCharacterSwap.compute();

		newWord=myCharacterSwap.getNewWord();
		System.out.println("Your new word is: "+ newWord);


	}
}