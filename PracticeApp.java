import java.util.*;

public class PracticeApp {
    public static void main(String args[]) {

        String input = "Who eats meat";

        Scanner keyboard = new Scanner(System.in);
        Practice myPractice = new Practice();

        myPractice.setSentence(input);

        myPractice.compute();

        System.out.println(myPractice.getReverse());

    }

}