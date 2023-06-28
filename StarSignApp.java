/*
StarSignApp.Java
M McCreary
*/

import javax.swing.*;
public class StarSignApp{
    public static void main(String[] args){

        String month;
        int date;

        StarSign myStarSign=new StarSign();

        month=JOptionPane.showInputDialog(null, "Please enter your birth month. E.g. April.");
        myStarSign.setMonth(month);

        date=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the date in the month on which you were born. E.g. 19"));
        myStarSign.setDate(date);

        myStarSign.compute();

        JOptionPane.showMessageDialog(null, "Your star sign is " + myStarSign.getStarSign());
    }
}
