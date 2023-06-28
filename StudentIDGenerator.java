import java.util.Random;
import java.util.Scanner;

public class StudentIDGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept first name and last name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Generate student ID
        String studentID = generateStudentID(firstName, lastName);

        // Display the generated student ID
        System.out.println("Generated student ID: " + studentID);
    }

    private static String generateStudentID(String firstName, String lastName) {
        StringBuffer studentID = new StringBuffer();

        // Add the first letter of the first name
        if (!firstName.isEmpty()) {
            char firstInitial = Character.toUpperCase(firstName.charAt(0));
            studentID.append(firstInitial);
        }

        // Add the first letter of the last name
        if (!lastName.isEmpty()) {
            char lastInitial = Character.toUpperCase(lastName.charAt(0));
            studentID.append(lastInitial);
        }

        // Add the current year and a random number
        int currentYear = java.time.Year.now().getValue();
        studentID.append(currentYear).append(new Random().nextInt(10));

        return studentID.toString();
    }
}
