import javax.swing.*;

public class MonthApp{

	public static void main(String args[]){
		// Set up variables
		String month = "";
		String answer ="";
		// Set up objects
		Month myMonth=new Month();

		// Get the input
		month = JOptionPane.showInputDialog(null,"Enter your month (e.g. Jan) : ");

		// Set the month in the object and run its compute method
		myMonth.setMonth(month);
		myMonth.compute();
		answer=myMonth.getAnswer();


		// Show the output
		JOptionPane.showMessageDialog(null, "There are " + answer + " days in the month of " + month);

	}
}