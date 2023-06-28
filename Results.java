/*
Results.java
N McDonald
13/04/2023
*/

public class Results{

	private int[][] quiz;
	private int bestResult;
	private int worstResult;
	private int[] totalWorst;
	private int[] totalBest;

	public Results(){
		quiz=new int[10][3];
		bestResult=0;
		worstResult=0;
		totalWorst=new int[10];
		totalBest=new int[10];
		}

	public void setQuiz(int[][] quiz){
		this.quiz=quiz;
		}

	public void compute(){


		for(int i=0;i<quiz.length;i++){

			bestResult=quiz[0][0];
			worstResult=quiz[0][0];



			for(int a=0;a<quiz[i].length;a++){

				if(quiz[i][a]>=0&&quiz[i][a]<=100){
				if(quiz[i][a]>bestResult){
					bestResult=quiz[i][a];
					}
					}
					else{
						System.out.println("Error.Invalid Number for Student "+(i+1));
						};

				if(quiz[i][a]>=0&&quiz[i][a]<=100){
				if(quiz[i][a]<worstResult){
					worstResult=quiz[i][a];
					}
					}
					else{
						System.out.println("Error.Invalid Number for Student "+(i+1));
						};

					totalBest[i]=bestResult;
					totalWorst[i]=worstResult;
				}


		 }


	}

	public int getBest(int i){
		return totalBest[i];
		}

	public int getWorst(int i){
		return totalWorst[i];
		}





}