import java.util.Scanner; //This imports the scanner utility
import java.lang.Math; //This imports the math language
public class app {//The beginning of the app class
	static Scanner input = new Scanner(System.in); // created the Scanner object with the name "input"
	static String name, surname; // Declares the string variables name and surname
	static int year; // Declares the integer values year and random
	static double random;//Declares the double value temp

	public static void run() {//the run method is declared, it is what is called in the startApp class
		getName();//this runs the getName method
		getYear();//This runs the getYear method
		randomNum();//This runs the randomNum method
		combine();// This runs the combine method
	}//the end of the run method

	public static void getName() {//This is the start of the getName method
		System.out.println("Please input your name: ");//asks for the users name
		name = input.next();//asks for input from the user for their name
		System.out.println("Please input your surname: ");//asks for the users surname
		surname = input.next();//asks for the input from the user for their surname
	}// the end of the getName method

	public static void getYear(){//The start of the getYear method
		System.out.println("Please input the year you are attending college : ");//Asks for the college year
		year = input.nextInt();//asks for input from the user for the college year
	}// the end of the getYear method

	public static void randomNum() {//The start of the randomNum method
		random = Math.floor(Math.random() * 10) ;//This declares the random number
	}// the end of the randomNum method

	public static void combine(){//The start of the combine method
		name = name.substring(0,1);
		surname = surname.substring(0,1);
		System.out.println("Your student ID : " + name + surname + year + random);
	}// The end of the combine method
}