/*
RainfallApp.java
N McDonald
10/04/2023
*/

public class RainfallApp{
	public static void main(String args[]){
		int[][]rain={{2,4,3,2,1,1,4},{5,3,1,2,1,3,4},{3,3,2,3,1,1,2},{2,1,3,3,2,1,1}};
		String message="";

		Rainfall myRain=new Rainfall();
		myRain.setRain(rain);

		myRain.compute();

		message=myRain.getMessage();

		System.out.println(message);







		}
	}