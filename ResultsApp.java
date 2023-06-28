/*
ResultsApp.java
N McDonald
13/04/2023
*/
import java.util.*;

public class ResultsApp{
	public static void main(String[] args){

		int[][] quiz=new int[10][3];
		int[] totalWorst=new int[10];
	    int[] totalBest=new int[10];

		Results myResult=new Results();
		Scanner keyboard=new Scanner(System.in);

		for(int i=0;i<quiz.length;i++){

			System.out.print("Student "+(i+1)+", Enter the grades for three subjects:\n");

			for(int a=0;a<quiz[i].length;a++){

				System.out.print("Quiz "+(a+1)+":");
				quiz[i][a]=keyboard.nextInt();
			}


			}

				myResult.setQuiz(quiz);

				myResult.compute();

				for(int i=0;i<quiz.length;i++){
					totalWorst[i]=myResult.getWorst(i);
					totalBest[i]=myResult.getBest(i);

					System.out.println("Student "+(i+1)+":\nBest result: "+totalBest[i]+"\nWorst result: "+totalWorst[i]);
					}

		}




	}