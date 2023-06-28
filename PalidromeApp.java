/*
Palidrome.java
M McCreary
*/

import java.util.*;
public class PalidromeApp{
	public static void main(String args[]){

	//Variables
	String word="";
	String newWord="";
	String message="";

	//Objects
	Scanner keyboard=new Scanner(System.in);
	Palidrome myPalidrome=new Palidrome();

	//Input
	System.out.println("Please enter a word. I.E Laptop or Hannah");
	word=keyboard.nextLine();
	myPalidrome.setWord(word);

	//Process
	myPalidrome.compute();
	newWord=myPalidrome.getNewWord();
	message=myPalidrome.getMessage();

	//Output
	System.out.println(message);

	}
}
