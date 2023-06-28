import java.util.*;
public class NegativeApp{
	public static void main(String args[]){

	//Variables
	String tweet="";
	String output="";

	//Objects
	Scanner keyboard=new Scanner(System.in);
	Negative myNegative=new Negattive();

	//input
	System.out.println("Please enter a stentence. i.e This is great");
	tweet=keyboard.nextLine();
	myNegative.setTweet(tweet);t

	//process
	myNegative.compute();

	//Output
	output=myNegative.getOutput();
	System.out.println("the negative of that tweet is: "+output);
	}
}
