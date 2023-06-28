/*
CharacterSwap.Java
M McCreary
09.04.2023
*/

public class CharacterSwap{

	//Data Members
	private String word;
	private String newWord;
	private StringBuffer strBuff;

	//Contructor
	public CharacterSwap(){

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
		strBuff.setLength(0);
		strBuff.append(word.charAt(word.length() - 1));
		strBuff.append(word.substring(1, word.length() - 1));
        strBuff.append(word.charAt(0));

		newWord=strBuff.toString();
	}

	//Getter
	public String getNewWord(){
		return newWord;
	}

}