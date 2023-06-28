import java.util.*;
public class StudentIDApp{
public static void main(String args[]){

String fName="";
String lName="";
int year=0;
String studentID="";

Scanner keyboard=new Scanner(System.in);
StudentID sid=new StudentID();

System.out.println("enter your first name");
fName=keyboard.nextLine();
sid.setFName(fName);

System.out.println("enter your surname");
lName=keyboard.nextLine();
sid.setLName(lName);

System.out.println("enter the year you start college");
year=keyboard.nextInt();
sid.setYear(year);

sid.compute();

studentID=sid.getOutput();

System.out.println(studentID);
}
}