/*
*
*Verify.java
*
*/
public class Verify{
	//data members
	private String cardNum, hiddenNum;
	private StringBuffer sb;

	//constructors
	public Verify(){
		cardNum = hiddenNum = "";
	}

	//set method - 1 for each input
	public void setCardNum(String cardNum){
		this.cardNum = cardNum;
	}

	//my other methods
	public void hide(){
		sb = new StringBuffer(); //1
		for(int i = 0; i < cardNum.length()-4; i++){
			if(cardNum.charAt(i) == ' '){
				sb.append(' ');  //2
			}else{
				sb.append('*');
			}
		}
		for(int i = cardNum.length()-4; i < cardNum.length(); i++){
			sb.append(cardNum.charAt(i));
		}
		hiddenNum = sb.toString(); //3
	}

	public void hide2(){
		sb = new StringBuffer(); //1
		for(int i = 0; i < cardNum.length(); i++){
			if(i < cardNum.length()-4){ //i<cardNum-4
				if(cardNum.charAt(i) == ' '){
					sb.append(' ');  //2
				}else{
					sb.append('*');
			}
				//check for star or space
			}else if(i >= cardNum.length()-4){ //cardNum >
				//add the num
				sb.append(cardNum.charAt(i));
			}
		}
		hiddenNum = sb.toString(); //3
	}

	//get methods - 1 for each output
	public String getHiddenNum(){
		return hiddenNum;
	}


}