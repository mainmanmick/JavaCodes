/*
PPSApp.Java
M McCreary
15.03.2023
*/

import java.util.*;
public class PPSApp{
	public static void main(String args[]){

		String ppsNumber;
		String message;

		Scanner keybaord=new Scanner(System.in);
		PPS myPPS=new PPS();

		System.out.println("Please enter your PPS Number. E.G 9555475A");
		ppsNumber=keybaord.nextLine();
		myPPS.setPpsNumber(ppsNumber);

		myPPS.compute();
		message=myPPS.getMessage();
		System.out.println(message);


	}
}

