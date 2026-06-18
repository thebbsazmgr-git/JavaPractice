import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class DailySalesLog {
    static void main(String[] args) {
        // Array of 7 days sales
        double[] sales = {1200.5, 1500.0, 980.75, 2000.0, 1750.25, 1600.0, 2100.5};
        // File writing using try-with-resources
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("weekly_sales.txt"))) {
            for (double s : sales) {
                bw.write(String.valueOf(s));
                bw.newLine();
            }
            System.out.println("Weekly sales saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}