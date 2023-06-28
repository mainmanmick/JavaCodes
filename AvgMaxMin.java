/*
AvgMaxMin.java
M McCreary
10.04.2023
*/

public class AvgMaxMin{

	//Data Members
	private int arr[];
	private int average;
	private int sum;
	private int min[];
	private int max[];

	//Constructor
	public AvgMaxMin(){
		arr=new int[5];
		average=0;
		sum=0;
		max=new int[5];
		min=new int[5];
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
		int max=arr[0];
		for(int i=1;i<5;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		this.max[0]=max;

		int min=arr[0];
		for(int i=1;i<5;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		this.min[0]=min;
	}

	//Setter
	public int getAverage(){
		return average;
	}
	public int getMax(int index){
		return max[index];
	}
	public int getMin(int index){
			return min[index];
	}
}