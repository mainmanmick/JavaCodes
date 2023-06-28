/*
CharacterSample.java
M McCreary
14.03.2023
*/

//Create an application that asks the user to enter a word and count the amount of characters in that word.

import java.util.*;
public class CharacterSample{
	public static void main(String args[]){

	String word; //Input - to ask user for their word
	int len; //Hold the amount of characters in the word

	Scanner keyboard=new Scanner(System.in);

	//Step 1: ask the user for their word
	System.out.println("Please enter a word?");
	word=keyboard.nextLine();


	//Step2: get the length of the word
	len=word.length();


	//Step3: send back to the user how many characters are in that word
	System.out.println("So, there are "+len+" characters in your word "+word);

	}
}
