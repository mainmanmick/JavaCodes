/*
Palidrome.java
M McCreary
*/

public class Palidrome{

	//Data Members
	private String word;
	private String message;
	private String newWord;
	private StringBuffer strBuff;

	//Constructor
	public Palidrome(){
		word="";
		message="";
		newWord="";
		strBuff=new StringBuffer();
	}

	//Setters
	public void setWord(String word){
		this.word=word;
	}

	//Compute
	public void compute(){
		word=word.toLowerCase();
		for(int i=0;i<word.length();i++){
			strBuff.append(word.charAt(i));
		}
		strBuff.reverse();
		newWord=strBuff.toString();

		if(newWord.equals(word)){
			message=("The word you have entered is a palidrome");
		}
		else{
			message=("The word you have entered is not a palidrome");
		}
	}

	//Getters
	public String getNewWord(){
		return newWord;
	}
	public String getMessage(){
		return message;
	}
}