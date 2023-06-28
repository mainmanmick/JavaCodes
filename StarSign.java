/*
StarSign.Java
M McCreary
*/

public class StarSign{

	private String month;
	private int date;
	private String starSign;


	public StarSign(){
		date=0;
		month="";
		starSign="";
	}

	public void setMonth(String month){
		this.month=month;
	}

	public void setDate(int date){
		this.date=date;
	}

	    public void compute(){
	     if(month.equalsIgnoreCase("january")){
	          if(date>=1 && date<=19){
	                starSign="Capricorn";
	            }
	            else if(date>=20 && date<=31){
	                starSign="Aquarius";
	            }
	        }
	        else if(month.equalsIgnoreCase("february")){
	            if(date>=1 && date<=18) {
	                starSign="Aquarius";
	            }
	            else if (date>=19 && date<=28){
	                starSign="Pisces";
	            }
	        }
	        else if(month.equalsIgnoreCase("march")){
	            if(date>=1 && date<=20){
	                starSign="Pisces";
	            }
	            else if(date>=21 && date<=31){
	                starSign="Aries";
	            }
	        }
	        else if(month.equalsIgnoreCase("april")){
	            if(date>=1 && date<=19){
	                starSign="Aries";
	            }
	            else if(date>=20 && date<=30){
	                starSign="Taurus";
	            }
	        }
	        else if(month.equalsIgnoreCase("may")){
	            if(date>=1 && date<=20){
	                starSign="Taurus";
	            }
	            else if(date>=21 && date<=31){
	                starSign="Gemini";
	            }
	        }
	        else if (month.equalsIgnoreCase("june")){
	            if(date>=1 && date<=20){
	                starSign="Gemini";
	            }
	            else if(date>=21 && date<=30){
	                starSign="Cancer";
	            }
	        }
	        else if(month.equalsIgnoreCase("july")){
	            if (date>=1 && date <=22){
	                starSign="Cancer";
	            }
	            else if(date>=23 && date <=31){
	                starSign="Leo";
	            }
	        }
	        else if(month.equalsIgnoreCase("august")){
	            if (date>=1 && date <=22){
	                starSign="Leo";
	            }
	            else if(date>=23 && date<=31){
	                starSign="Virgo";
	            }
	        }
	        else if (month.equalsIgnoreCase("september")){
	            if(date>=1 && date<=22){
	                starSign="Virgo";
	            }
	            else if(date>=23 && date<=30){
	                starSign="Libra";
	            }
	        }
	        else if(month.equalsIgnoreCase("october")){
	            if(date>=1 && date<=22){
	                starSign="Libra";
	            }
	            else if(date>=23 && date<=31){
	                starSign="Scorpio";
	            }
	        }
	        else if(month.equalsIgnoreCase("november")) {
	            if(date>=1 && date<=21){
	                starSign="Scorpio";
	            }
	            else if(date>=22 && date<=30){
	                starSign="Sagittarius";
	            }
	        }
	        else if(month.equalsIgnoreCase("december")){
	            if(date>=1 && date<=21){
	                starSign="Sagittarius";
	            }
	            else if(date>=22 && date<=31){
	                starSign="Capricorn";
	            }
	        }
	        else{
	        starSign="Invalid input";
			}
	    }

	    myStarSign.setMonth(month);
			return starSign;
		}
}