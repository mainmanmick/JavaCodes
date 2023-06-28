/*
*EncoderApp.java
*
*/
import java.util.Scanner;
public class EncoderApp{
	public static void main(String[] args){
		//vars
		String word;

		//declare and create obj
		Scanner input = new Scanner(System.in);
		Encoder e = new Encoder();

		//get user input
		System.out.println("Enter 1 word!");
		word = input.next();

		//call my methds
		e.setWord(word);
		e.encode();

		System.out.println(e.getEncodedWord());
	}
}
