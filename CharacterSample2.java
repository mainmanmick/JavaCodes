/*
CharacterSample2
M McCreary
14.03.2023
*/

//application that asks the user to enter their name and get the application to print the letters back individually.

import java.util.*;
public class CharacterSample2{
	public static void main(String args[]){

		String name; // Input to take the name from the user
		int len; //Store the amount of characters in the user name

		Scanner keyboard=new Scanner(System.in);

		System.out.println("Please enter your name");
		name=keyboard.nextLine();
		len=name.length();

		for(int i=0;i<len;i++){
			//accessing an individual characters from the name inside of the loop
				System.out.println(name.charAt(i));
			}
		System.out.println("So your name is "+name);


	}
}