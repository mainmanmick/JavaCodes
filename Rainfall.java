/*
Rainfall.java
N McDonald
10/04/2023
*/

public class Rainfall{

	private int rain[] [];
	private String message;
	private StringBuffer strBuff;

public Rainfall(){
	rain=new int[7] [4];
	message="";
	strBuff=new StringBuffer();
	}

public void setRain(int rain[] []){
	this.rain=rain;
	}

public void compute(){

	for(int i=0;i<rain.length;i++){
		    strBuff.append("Week"+(i+1)).append(": ");
		for(int a=0;a<rain[i].length;a++){
			strBuff.append(rain[i][a]).append(" ");
			}
		strBuff.append(" ");
		}
	message=strBuff.toString();

	}

public String getMessage(){
	return message;
	}


	}