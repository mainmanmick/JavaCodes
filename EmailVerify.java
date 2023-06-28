/*
*EmailVerify.java
*M McCreary
*/

public class EmailVerify{
	//data members
	private String email, hiddenEmail;
	//private StringBuffer strBuff;

	//constructors
	public EmailVerify(){
		email = hiddenEmail = "";
		//creating me StringBuffer in the method so I don't acciedently append to existing content
	}

	//set methods - 1 for each input
	public void setEmail(String email){
		this.email = email;
		System.out.println(" email in set "+this.email); //testing line
	}

	//my other methods
	public void compute(){
		StringBuffer strBuff = new StringBuffer(); //required only in this method
		int atSym = 0; //local variable for method
		for(int i = 0; i < email.length(); i++){
			if(email.charAt(i) == '@'){
				atSym = i; //pass that index over
			}
		}

		strBuff.append(email.charAt(0)); //add the first char unhidden to the strBuff

		for(int i = 1; i < atSym; i++){
			strBuff.append('*');
		}
		for(int i = atSym; i < email.length(); i++){
			strBuff.append(email.charAt(i));
		}
		hiddenEmail = strBuff.toString();

	}

	//get methods - 1 for each output
	public String getHiddenEmail(){
		return hiddenEmail;
	}
}