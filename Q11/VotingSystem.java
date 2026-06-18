//By Bibisha Magar
import java.util.Scanner;
public class VotingSystem {
    // Method that checks eligibility
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age: You must be at least 18 years old to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        input.close();
    }
}
