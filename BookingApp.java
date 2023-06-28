/*
BookingApp.Java
M McCreary
11.05.2023
*/

import java.util.*;
public class BookingApp{
	public static void main(String args[]){

		//Data Members
		String surname="";
		String month="";
		String bookingID="";
		int date=0;

		//Objects
		Scanner keyboard=new Scanner(System.in);
		Booking myBooking=new Booking();

		//Input
		boolean bookAgain = true;
		while(bookAgain){
			System.out.println("What is your surname. i.e Alderson");
			surname=keyboard.nextLine();
			myBooking.setSurname(surname);

			System.out.println("What month would you like to make a booking for. i.e December");
			month=keyboard.nextLine();
			myBooking.setMonth(month);

			System.out.println("what date in the month would you like to make a booking for. i.e 15");
			date=keyboard.nextInt();
			myBooking.setDate(date);

			//Process
			myBooking.compute();

			//Output
			bookingID=myBooking.getBookingID();
			System.out.println("Your booking ID is: "+bookingID);

			keyboard.nextLine();
			System.out.println("Do you want to book again");
			String response=keyboard.nextLine();

				if(!response.equalsIgnoreCase("Yes")){
					bookAgain=false;
				}
			}
		}
	}
