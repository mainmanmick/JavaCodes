/*
ReplaceApp.Java
M McCreary
28.03.2023
*/

import java.util.*;ga
public class ReplaceApp{
	public static void main(String args[]){

		String word,newWord;

		Scanner keyboard=new Scanner(System.in);
		Replace myReplace=new Replace();

		System.out.println("Please enter a word");
		word=keyboard.nextLine();
		myReplace.setWord(word);

		myReplace.compute();

		newWord=myReplace.getNewWord();
		System.out.println("Your new word is "+newWord);

	}
}