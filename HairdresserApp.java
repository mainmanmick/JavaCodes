/* HairdresserApp.java
M McCreary
02.03.2023
*/

import java.util.*;
public class HairdresserApp{
	public static void main(String args[]){

		String service;
		String length;
		String day;

		Scanner keyboard=new Scanner(System.in);
		Hairdresser myHairdresser=new Hairdresser();

		System.out.println("Welcome to the Hairdresser, Please enter the type of service you would like to receive? for example Cut or Colour");
		service=keyboard.nextLine();
		myHairdresser.setService(service);

		System.out.println("Is your hair Short or Long");
		length=keyboard.nextLine();
		myHairdresser.setLength(length);

		myHairdresser.compute();
		day=myHairdresser.getDay();
		System.out.println("Based on the service requuested you should come into the hairdresser on "+day);


	}
}