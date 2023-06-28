public class Negative{
	//Date Members
	private String tweet;
	private String output;
	private StringBuffer strBuff;

	//Constructor
	public Negative(){
		tweet="";
		output="";
		strBuff=new StringBuffer();
	}

	//Setters
	public void setTweet(String tweet){
		this.tweet=tweet;
	}

	//Compute
	public void compute() {
	        for (int i = 0; i < tweet.length(); i++) {
	            if (tweet.charAt(i) == ' ') {
	                if (i+2 < tweet.length() && tweet.charAt(i+1) == 'i' && tweet.charAt(i+2) == 's') {
	                    if (i+3 < tweet.length() && tweet.charAt(i+3) == ' ') {
	                        strBuff.append(" is not");
	                        i += 3;
	                    }
	                }
	            }
	            strBuff.append(tweet.charAt(i));
	        }
	        output = strBuff.toString();
    }

	//Getters
	public String getOutput(){
		return output;
	}
}