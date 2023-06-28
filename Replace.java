/*
Replace.Java
M McCreary
28.03.2023
*/

public class Replace{

	private String word; //input from the user
	private StringBuffer strBuff; //store the word to be altered
	private String newWord; //stores the altered word

	//Constructor
	public Replace(){

		word="";
		newWord="";
		strBuff=new StringBuffer();
	}

	//Setter
	public void setWord(String word){
		this.word=word;
	}

	//compute
	public void compute(){
		//loop to get the length of the word
		for(int i=0;i<word.length();i++){

			//check the word for a character 'a'
			if(word.charAt(i)=='a'){
				strBuff.append('*');//replace with a star
			}
			else{
				strBuff.append(word.charAt(i));
			}
		}
		//converts the word in the string buffer to a word stored in newWord
		newWord=strBuff.toString();
	}

	public String getNewWord(){
		return newWord;
	}

}