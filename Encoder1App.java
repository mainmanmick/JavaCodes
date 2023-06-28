/*
Encoder1App.Java
M McCreary
10.04.2023
*/

import java.util.*;
public class Encoder1App{
	public static void main(String args[]){

		//Variables
		String word="";
		String newWord="";

		//Objects
		Scanner keyboard=new Scanner(System.in);
		Encoder1 myEncoder1=new Encoder1();

		//Input
		System.out.println("Please enter a word you want to get encoded. ie 'Programming'");
		word=keyboard.nextLine();
		myEncoder1.setWord(word);

		//Process
		myEncoder1.compute();
		newWord=myEncoder1.getNewWord();

		//Output
		System.out.println("Your encoded version of "+word+" is: "+newWord);
	}
}