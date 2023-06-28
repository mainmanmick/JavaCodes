/*
AllNumbers.Java
M McCreary
07.03.2023
*/

public class AllNumbers{
	public static void main(String args[]){

		//variable
		int sum=0; //variable to store the total of numbers from 0 to 10.

		//for loop - print numbers from 0 to 10 inclusive
		//four stages of a for loop: start, end, progression and action
		for(int i=0;i<=10;i++){ //i=i+1 is another way of writing progression in a loop // i-- decrese by 1
		System.out.println(i);
		}

		//for loop - print from 10 to 0 inclusive.
		for(int i=10;i>=0;i--){
			System.out.println(i);
		}

		//while loop that displays the following numbers 10,20,30,40,50
		int k=10; //start the counter at 10
		while(k<=50){ //end the counter at 50
			System.out.println(k); //action - print out whatever is in the counter
			k=k+10; //progress by 10
		}

		//while loop that displays the numebrs: 100, 90,80,70,60
		int j=100;
		while(j>=60){
			System.out.println(j);
			j=j-10; //go backwards in 10's
		}

		//for loop that calculates the sum of numbers between 1 and 10.
		for(int m=0;m<=10;m++){
			//work out the calculation of the numbers
			sum=sum+m; //sum+=m
		} //ends the loop
		//action outside the curly brackets - print out the sum of the numbers
		System.out.println(sum);
	}
}