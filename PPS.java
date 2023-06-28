/*
PPS.Java
M McCreary
15.03.2023
*/

public class PPS{

	//data members
	private String ppsNumber;
	private String message;

	//Constructor
	public PPS(){
		ppsNumber="";
		message="";
	}

	//Setter
	public void setPpsNumber(String ppsNumber){
		this.ppsNumber=ppsNumber;
	}

	//Compute
	public void compute(){
		for(int i=0;i<ppsNumber.length();i++){
			if(ppsNumber.length()==8){
				if((ppsNumber.charAt(ppsNumber.length()-1)=='A'||ppsNumber.charAt(ppsNumber.length()-1)=='E'||ppsNumber.charAt(ppsNumber.length()-1)=='I'||ppsNumber.charAt(ppsNumber.length()-1)=='O'||ppsNumber.charAt(ppsNumber.length()-1)=='U')){
				message="The PPS Number you have entered is valid";
				}
				else{
				message="The PPS Number you have entered is invalid";
				}
			}
		}
	}

	public String getMessage(){
		return message;
	}
}