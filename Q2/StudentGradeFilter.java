import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating ArrayList
        ArrayList<Integer> scores = new ArrayList<>();
        // Asking user for number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        // Taking input from user
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter score for student " + i + ": ");
            int score = input.nextInt();
            scores.add(score);
        }
        // Displaying results
        System.out.println("\nGrade Results:");
        for (int score : scores) {
            System.out.print("Score: " + score + " -> ");

            if (score >= 90) {
                System.out.println("Distinction");
            }
            else if (score >= 40) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
        input.close();
    }
}