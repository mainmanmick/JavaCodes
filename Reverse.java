/*
Reverse.Java
M McCreary
15.04.2023
*/

public class Reverse{

	//Data Members
	private String word;
	private String newWord;
	private StringBuffer strBuff;

	//Constructor
	public Reverse(){
		word="";
		newWord="";
		strBuff=new StringBuffer();
	}

	//Setter
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
	}

	//Getters
	public String getNewWord(){
		return newWord;
	}
}
