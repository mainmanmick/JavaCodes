/*
PigLatinApp.Java
M McCreary
28.03.2023
*/

import java.util.*;
public class PigLatinApp{
	public static void main(String args[]){

		String word;
		String newWord;

		Scanner keyboard=new Scanner(System.in);
		PigLatin myPigLatin=new PigLatin();

		System.out.println("Please enter a word");
		word=keyboard.nextLine();
		myPigLatin.setWord(word);

		myPigLatin.compute();

		newWord=myPigLatin.getNewWord();
		System.out.println("Your new word is "+newWord);

	}
}

