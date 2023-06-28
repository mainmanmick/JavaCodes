/*
Jingle.java
M McCreary
28.02.2023
*/

public class Jingle{

	//data members
	private String activity;  //input
	private double time; //input
	private String day; //output

	//constructor
	public Jingle(){

		activity=""; //new String();
		time=0.0;
		day="";
	}

	//setters - 2 inputs
	public void setActivity(String activity){
		this.activity=activity;
	}

	public void setTime (double time){
		this.time=time;
	}

	//compute
	public void compute(){
		if(activity.equalsIgnoreCase("singing")){
			if(time==20.00){
				day="Monday";
			}
			if(time==25.00){
					day="Tuesday";
				}

			else{
				day="Wednesday";
			}
		}

		else if(activity.equalsIgnoreCase("Drawing")){
			if(time==40.00){
				day="Thursday";
			}
			if(time==35.00){
				day="Monday";
			}
			else{
				day="Friday";
			}
		}

		else if(activity.equalsIgnoreCase("Exercise")){
			if(time==20.00){
				day="Wednesday";
			}
			if(time==30.00){
				day="Thursday";
			}
			else{
				day="Friday";
			}
		}

	}


	//getters
	public String getDay(){
		return day;
	}

}


