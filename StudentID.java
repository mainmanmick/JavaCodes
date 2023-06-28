import java.util.*;
public class StudentID{

//DATA MEMBERS
private int year;
private String fName;
private String lName;
private int random;
private String randomString;
private String studentID;
private StringBuffer strBuff;

public StudentID(){
year=0;
fName="";
studentID="";
randomString="";
random=0;
lName="";
strBuff=new StringBuffer();
}

public void setFName(String fName){
this.fName=fName;
}

public void setLName(String lName){
this.lName=lName;
}

public void setYear(int year){
this.year=year;
}

public void compute(){
	strBuff.append(fName.charAt(0));
	strBuff.append(lName.charAt(0));
	strBuff.append(year);
	random=new Random().nextInt(10);
	randomString=Integer.toString(random);
	studentID=strBuff.toString();
}

public String getOutput(){
	return studentID;
}


}

