/*
TestApp.java
M McCreary
06.05.2023
*/


//Application that swaps the colour red for blue in a sentence

import java.util.*;
public class TestApp{
public static void main(String args[]){
	//Variables
	String input="";
	String output="";

	//Objects
	Scanner keyboard=new Scanner(System.in);
	Test myTest=new Test();

	//input
	System.out.println("Please enter a sentence with the colour red. ie, the red bowl");
	input=keyboard.nextLine();
	myTest.setInput(input);

	//Process
	myTest.compute();
	output=myTest.getOutput();

	//Output
	System.out.println(output);
}
}