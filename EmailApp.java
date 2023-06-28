/*
*EmailApp.java
*M McCreary
*/

import java.util.Scanner;
public class EmailApp{
	public static void main(String[] args){
		String email;

		//obj
		EmailVerify ev = new EmailVerify();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter email");
		email = input.nextLine();

		ev.setEmail(email);
		ev.compute();


		System.out.println(ev.getHiddenEmail());
	}

}
