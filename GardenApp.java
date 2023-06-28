/*
GardenApp.java
M McCreary
15.02.23
*/

import java.util.*;
public class GardenApp{
	public static void main(String args[]){

		String name;
		final double SHOVELS=35;
		final double FLOWERS=5.99;
		final double SEEDS=4.99;
		final double COMPOST=14.99;
		int totalShovels;
		int totalFlowers;
		int totalSeeds;
		int totalCompost;
		double totalCost;

		Scanner keyboard;
		keyboard=new Scanner(System.in);
		Garden myGarden;
		myGarden=new Garden();

		System.out.println("What is your name?");
		name=keyboard.nextLine();

		System.out.println("How many shovels do you want?");
		totalShovels=keyboard.nextInt();
		myGarden.setTotalShovels(totalShovels);

		System.out.println("How many flowers do you want?");
		totalFlowers=keyboard.nextInt();
		myGarden.setTotalFlowers(totalFlowers);

		System.out.println("How many seeds do you want?");
		totalSeeds=keyboard.nextInt();
		myGarden.setTotalSeeds(totalSeeds);

		System.out.println("How many bags of compost do you want?");
		totalCompost=keyboard.nextInt();
		myGarden.setTotalCompost(totalCompost);

		totalCost=totalCost=(SHOVELS*totalShovels)+(FLOWERS*totalFlowers)+(SEEDS*totalSeeds)+(COMPOST*totalCompost);

		System.out.println("Thanks "+name+" your total cost will be "+totalCost);
	}
}


