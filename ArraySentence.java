/*
    ArrayList.Java
 * M. McCreary/M. Hasan
 * 01.07.2023
 */

 //This code counts the sentence from a user and then returns the number of sentecnes and each sentence indidcuall
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySentence {
    private String text;
    private int numOfSentences;
    private ArrayList<String> array;
    private String[] sentences;

    public ArraySentence() {
        text = "";
        numOfSentences = 0;
        array = new ArrayList<String>();
        sentences = new String[0];
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumOfSentences() {
        return numOfSentences;
    }

    public String[] getSentences() {
        return sentences;
    }

    public void compute() {
        sentences = text.split("[.?!]");
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                array.add(sentence.trim());
                numOfSentences++;
            }
        }
    }

    public static void main(String[] args) {
        ArraySentence myArray = new ArraySentence();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String input = scanner.nextLine();
        myArray.setText(input);

        myArray.compute();

        System.out.println("Total sentences: " + myArray.getNumOfSentences());
        System.out.println("Sentences:");

        for (String sentence : myArray.getSentences()) {
            System.out.println(sentence);
        }

        scanner.close();
    }
}
