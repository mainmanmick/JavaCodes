/*
JingleApp.java
M McCreary
28.02.2023
*/

import java.util.*;
public class JingleApp{
	public static void main(String args[]){


		//Variables
		 String activity;
		 double time;
		 String day;

		//objects
		Scanner keyboard=new Scanner(System.in);
		Jingle myJingle=new Jingle();


		//inputs
		System.out.print("Welcome to JingleApp. Please enter an activity you wish to do? For example: Singing or Drawing or Exercise");
		activity=keyboard.nextLine();
		myJingle.setActivity(activity);

		System.out.print("How long do you want to do the activity for?");
		time=keyboard.nextDouble();
		myJingle.setTime(time);

		//process
		myJingle.compute();


		//outputs
		day=myJingle.getDay();
		System.out.println("Based on your activity you should call to the creche on "+day);

	}




}