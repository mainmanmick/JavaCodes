/*
Sentence.Java
M McCreary
01.04.2023
*/

public class Sentence{

	private String sentence;
	private int numOfVowels;
	private int numOfConsonant;
	private int numOfSpaces;

	public Sentence(){
		sentence="";
		numOfVowels=0;
		numOfConsonant=0;
		numOfSpaces=0;
	}

	public void setSentence(String sentence){
		this.sentence=sentence;
	}

	public void compute(){
		sentence.toLowerCase();
		for(int i=0;i<sentence.length();i++){
			char ch=sentence.charAt(i);
			if(ch==' '){
				numOfSpaces++;
			}
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				numOfVowels++;
			}
			else{
				numOfConsonant++;
			}
		}
	}

	public int getNumOfVowels(){
		return numOfVowels;
	}
	public int getNumOfConsonant(){
		return numOfConsonant;
	}
	public int getNumOfSpaces(){
		return numOfSpaces;
	}

}