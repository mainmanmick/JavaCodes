public class Month{

	private String month;//input
	private String answer;//output

	// Constructor
	public Month(){
		month = "";
		answer = "";
	}
//one question to ask the user - what month do you want to enter?
	public void setMonth(String month){
		this.month = month;
	}


	public void compute(){
		switch (month.toLowerCase()){
			case"jan":
			answer="31 Days";
			break;
			case"feb":
			answer="28 Days";
			break;
			case "mar":
			answer="31 Days";
			break;
			case"apr":
			answer="30 Days";
			break;
			default:
			answer="I don't recognise that month!";
		}

	}

	public String getAnswer(){
		return answer;
	}



}