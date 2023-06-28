/*
SentenceApp.Java
M McCreary
01.04.2023
*/

import java.util.*;
public class SentenceApp{
	public static void main(String args[]){

		String sentence;
		int numOfVowels;
		int numOfSpaces;
		int numOfConsonant;

		Scanner keyboard=new Scanner(System.in);
		Sentence mySentence=new Sentence();

		System.out.println("Please enter a sentence");
		sentence=keyboard.nextLine();
		mySentence.setSentence(sentence);

		mySentence.compute();

		numOfVowels=mySentence.getNumOfVowels();
		numOfSpaces=mySentence.getNumOfSpaces();
		numOfConsonant=mySentence.getNumOfConsonant();

		System.out.println("Your sentence contains "+numOfVowels+" number of vowels. "+numOfSpaces+ " number of spaces. "+numOfConsonant+" number of consonants.");
	}
}

