/*
PigLatin.Java
M McCreary
28.03.2023
*/

public class PigLatin{

	//Data Members
	private String word;
	private StringBuffer strBuff;
	private String newWord;

	public PigLatin(){

		word="";
		strBuff=new StringBuffer();
		newWord="";
	}

	public void setWord(String word){
		this.word=word;
	}

	public void compute(){
		char firstChar=word.charAt(0);
		char firstCharLower=Character.toLowerCase(firstChar);


		for(int i=1;i<word.length();i++){
			char ch=word.charAt(i);
			strBuff.append(ch);
		}

			strBuff.append(firstCharLower);
			strBuff.append("ay");
			newWord=strBuff.toString();
		}
		public String getNewWord(){
			return newWord;
		}
}