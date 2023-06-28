/*
Encoder1.Java
M McCreary
10.04.2023
*/

public class Encoder1{

	//Data Members
	private String word;
	private String newWord;
	private StringBuffer strBuff;

	//Constructor
	public Encoder1(){
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
		word.toLowerCase();

		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'){
				strBuff.append('1');
			}
			else if(word.charAt(i)=='e'){
				strBuff.append('5');
			}
			else if(word.charAt(i)=='i'){
				strBuff.append('9');
			}
			else if(word.charAt(i)=='o'){
				strBuff.append("15");
			}
			else if(word.charAt(i)=='u'){
				strBuff.append("21");
			}
			else{
				strBuff.append(word.charAt(i));
			}
		 }
		 strBuff.reverse();
		 newWord=strBuff.toString();
		}

	//Getters
	public String getNewWord(){
		return newWord;
	}
}
