public class Test{

//Data members
private String input;
private String output;
private StringBuffer strBuff;

//Constructor
public Test(){
	input="";
	output="";
	strBuff=new StringBuffer();
}

//Setters
public void setInput(String input){
	this.input=input;
}

//compute
/*
Test.java
M McCreary
06.05.2023
*/

//Application that swaps the colour red for blue in a sentence

public void compute(){
	input.toLowerCase();
	for(int i=0;i<input.length();i++){
		if(input.charAt(i)==' '){
			if(i+3<input.length()&& input.charAt(i+1)=='r' && input.charAt(i+2)=='e' && input.charAt(i+3)=='d'){
				if(i+4<input.length() && input.charAt(i+4)==' '){
					strBuff.append(" blue");
					i+=4;
				}
			}
		}
		strBuff.append(input.charAt(i));
	}
	output=strBuff.toString();
}

//getters
public String getOutput(){
	return output;
}
}
