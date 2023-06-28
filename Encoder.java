/*
*
*
*/
public class Encoder{
	//data members
	private String word, encodedWord;
	private char c;
	private StringBuffer strBuff;

	//constructors
	public Encoder(){
		word = encodedWord = "";
		c = ' ';
	}

	//set methods - 1 for each input
	public void setWord(String word){
		this.word = word;
	}

	//my other methods
	public void encode(){
		strBuff = new StringBuffer(); //
		for(int i = word.length()-1; i >= 0; i--){
			char c = word.charAt(i);
			if(c == 'a'){
				strBuff.append("1");
			}else if(c == 'e'){
				strBuff.append("5");
			}else if(c == 'i'){
				strBuff.append("9");
			}else if(c == 'o'){
				strBuff.append("15");
			}else if(c == 'u'){
				strBuff.append("21");
			}else{
				strBuff.append(c);
			}
		}
		encodedWord = strBuff.toString();
	}


	//get methods - 1 for each output
	public String getEncodedWord(){
		return encodedWord;
	}

}