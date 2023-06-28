/*
HotelApp
M. McCreary
08.02.2023
*/

import java.util.*;
public class HotelApp{
	public static void main(String args[]){

	double costPerPerson;
	int numberOfNights;
	int numberOfPeople;
	double totalCost;

	costPerPerson=60.00;
	numberOfNights=0;
	numberOfPeople=0;
	totalCost=0.00;

	Scanner keyboard;

	keyboard=new Scanner(System.in);

	System.out.println("Please enter number of nights you wish to stay");
	numberOfNights=keyboard.nextInt();
	System.out.println("Please enter number of people staying");
	numberOfPeople=keyboard.nextInt();

	totalCost=costPerPerson * (numberOfNights * numberOfPeople);

	System.out.println("The total cost for your stay is "+totalCost);

	}

}