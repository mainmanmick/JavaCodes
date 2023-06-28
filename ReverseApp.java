/*
ReverseApp.Java
M McCreary
15.04.2023
*/

import java.util.*;
public class ReverseApp{
	public static void main(String args[]){

		//Variables
		String word="";
		String newWord="";

		//Objects
		Scanner keyboard=new Scanner(System.in);
		Reverse myReverse=new Reverse();

		//Input
		System.out.println("Please enter a word. I.E Laptop");
		word=keyboard.nextLine();
		myReverse.setWord(word);

		//Process
		myReverse.compute();
		newWord=myReverse.getNewWord();

		//Output
		System.out.println("the reverse of "+word+" is: "+newWord);
	}
}