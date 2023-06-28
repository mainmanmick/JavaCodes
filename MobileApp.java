/*
MobileApp.java
M McCreary
14.03.2023
*/

import java.util.*;
public class MobileApp{
	public static void main(String args[]){

		//Variables
		String number;
		String message;

		//Objects
		Scanner keyboard=new Scanner(System.in);
		Mobile myMobile=new Mobile();

		//Input
		System.out.println("Please enter your mobile number");
		number=keyboard.nextLine();
		myMobile.setNumber(number);

		//Process
		myMobile.compute();

		//Output
		message=myMobile.getMessage();
		System.out.println(message);



	}
}