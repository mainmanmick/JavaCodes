/*
Average.java
M McCreary
04.04.2023
*/

public class Average{

	//Data Members
	int arr[];
	int average;
	int sum;

	//Constructor
	public Average(){
		arr=new int[5];
		average=0;
		sum=0;
	}

	//Setters
	public void setArr(int index, int arr){
		this.arr[index]=arr;
	}

	//Compute
	public void compute(){
		for(int i=0;i<5;i++){
			sum=sum+arr[i];
			average=sum/arr.length;
		}
	}

	//Setter
	public int getAverage(){
		return average;
	}
}