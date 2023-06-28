/*
Garden.java
M McCreary
15.02.23
*/

public class Garden{

	private String name;
	private final double SHOVELS=35;
	private final double FLOWERS=5.99;
	private final double SEEDS=4.99;
	private final double COMPOST=14.99;
	private int totalShovels;
	private int totalFlowers;
	private int totalSeeds;
	private int totalCompost;
	private double totalCost;

	public Garden(){

		name="";
		totalShovels=0;
		totalFlowers=0;
		totalSeeds=0;
		totalCompost=0;
		totalCost=0.0;
	}

	public void setTotalShovels(int totalShovels){
		this.totalShovels=totalShovels;
	}

	public void setTotalFlowers(int totalFlowers){
			this.totalFlowers=totalFlowers;
	}

	public void setTotalSeeds(int totalSeeds){
			this.totalSeeds=totalSeeds;
	}

	public void setTotalCompost(int totalCompost){
			this.totalCompost=totalCompost;
	}

	public void compute(){
		totalCost=(SHOVELS*totalShovels)+(FLOWERS*totalFlowers)+(SEEDS*totalSeeds)+(COMPOST*totalCompost);
	}

	public double getTotalCost(){
		return totalCost;
	}

}