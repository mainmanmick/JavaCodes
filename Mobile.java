/*
Mobile.java
M McCreary
14.03.2023
*/

//Create an application to check for a valid mobile phone number. A valid number in 10 digits in length and starts with either 083,085 and 087. Your applicaton should let the user know if the number is valid or invalid.

public class Mobile{

	//data members
	private String number; //input of the mobile number
	private String message; //output to the user to let them know if the number is valid or not

	//Constructor
	public Mobile(){
		number="";
		message="";
	}

	//setter
	public void setNumber(String number){
		this.number=number;
	}

	//compute
	public void compute(){
		//if the number has a length of 10
		if(number.length()==10){

			//if the number has a character 0 as index 0 && the number has a character of 8 at index 1
			if(number.charAt(0)=='0' && number.charAt(1)=='8'){

				//if the number has an individual character at index 2(which is the 3rd character in the number and if it is equal to 3, 5 or 7
				if(number.charAt(2)=='3'||number.charAt(2)=='5'||number.charAt(2)=='7'){
					message="This is a valid mobile number";
	 			}
	 			else{
							message="This is not a valid mobile number";
				}
			}
		}

	}

	public String getMessage(){
		return message;
	}

}

