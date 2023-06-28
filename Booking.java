/*
Booking.Java
M McCreary
11.05.2023
*/

import java.util.*;
public class Booking{

	//Data Members
	private String surname;
	private String month;
	private int date;
	private int random;
	private StringBuffer strBuff;
	private String bookingID;
	private Random randomGenerator;

	//Constructor
	public Booking(){
		surname="";
		month="";
		date=0;
		random=0;
		strBuff=new StringBuffer();
		bookingID="";
		randomGenerator=new Random();
	}

	//Set Method - Setters
	public void setSurname(String surname){
		this.surname=surname;
	}

	public void setMonth(String month){
		this.month=month;
	}

	public void setDate(int date){
		this.date=date;
	}

	//Compute
	public void compute(){
		strBuff.append(surname.charAt(0));
		strBuff.append(month.charAt(0));
		strBuff.append(date);
		random = randomGenerator.nextInt(10);
		strBuff.append(random);
		bookingID=strBuff.toString();

	}
	//Get Method - Getters
	public String getBookingID(){
		return bookingID;
	}


}