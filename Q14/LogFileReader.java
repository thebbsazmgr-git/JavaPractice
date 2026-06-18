import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class LogFileReader {
    static void main(String[] args) {
        ArrayList<String> errorLogs = new ArrayList<>();
        try {
            File file = new File("server.log");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.contains("ERROR")) {
                    errorLogs.add(line);
                }
            }
            input.close();
            // Display filtered ERROR logs
            System.out.println("=== ERROR LOGS ===");
            for (String log : errorLogs) {
                System.out.println(log);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}