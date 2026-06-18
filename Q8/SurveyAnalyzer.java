//By Bibisha Magar
public class SurveyAnalyzer {
    static void main(String[] args) {
        // Survey responses (ratings from 1 to 5)
        int[] responses = {
                5,4,3,5,2,1,4,5,3,2,
                1,5,4,4,3,2,5,1,3,4,
                2,5,5,4,3,1,2,4,5,3,
                2,1,5,4,3,2,5,1,4,4,
                3,2,5,1,4,3,5,2,4,5
        };
        // Frequency array
        int[] freq = new int[6];
        // Counting occurrences
        for(int r : responses) {
            freq[r]++;
        }
        // Display results
        System.out.println("Survey Rating Frequencies:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + " = " + freq[i]);
        }
    }
}
