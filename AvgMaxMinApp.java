/*
AvgMaxMinApp.java
M McCreary
10.04.2023
*/

//Ask the user for 5 whole numbers and work out the average and send it back to the user

import java.util.*;
public class AvgMaxMinApp{
	public static void main(String args[]){

	//variables
	int arr[]=new int[5];
	int min[]=new int[5];
	int max[]=new int[5];
	int sum=0; //work out the sum of the numbers coming in from the user
	int average=0; //work out the average of the 5 numbers

	//object
	Scanner keyboard=new Scanner(System.in);
	AvgMaxMin myAvgMaxMin=new AvgMaxMin();

	//input
	//create a loop to grab the numbers in a array
	for(int i=0;i<5;i++){
		System.out.println("Please enter a number");
		//saving the 5 numbers from the user
		arr[i]=keyboard.nextInt();
		myAvgMaxMin.setArr(i, arr[i]);
	}

	myAvgMaxMin.compute();
	average=myAvgMaxMin.getAverage();

	for(int i=0;i<5;i++){
		max[i]=myAvgMaxMin.getMax(i);
	}
	for(int i=0;i<5;i++){
		min[i]=myAvgMaxMin.getMin(i);
	}

	System.out.println("The total average of the numbers is " + average +" The maximum number in the array is "+max[0]+" the minimum number in this array is "+min[0]);
	}
}