/*
*
*
*/
import java.util.Scanner;
public class Login{
	public static void main(String args[]){
		//vars
		String cardNum;

		//obj
		Scanner input = new Scanner(System.in);
		Verify v = new Verify();

		System.out.println("Enter card details");
		cardNum = input.nextLine();

		//call set method

		v.setCardNum(cardNum);
		//call my hide methods
		v.hide2();
		//call and display my get method

		System.out.println(v.getHiddenNum());

	}

}