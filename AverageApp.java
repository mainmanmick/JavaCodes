/*
AverageApp.java
M McCreary
04.04.2023
*/

//Ask the user for 5 whole numbers and work out the average and send it back to the user

import java.util.*;
public class AverageApp{
	public static void main(String args[]){

	//variables
	int arr[]=new int[5];
	int sum=0; //work out the sum of the numbers coming in from the user
	int average=0; //work out the average of the 5 numbers

	//object
	Scanner keyboard=new Scanner(System.in);
	Average myAverage=new Average();

	//input
	//create a loop to grab the numbers in a array
	for(int i=0;i<5;i++){
		System.out.println("Please enter a number");
		//saving the 5 numbers from the user
		arr[i]=keyboard.nextInt();
		myAverage.setArr(i, arr[i]);
	}

	myAverage.compute();
	average=myAverage.getAverage();

	System.out.println("The total average of the numbers is " + average);
	}
}