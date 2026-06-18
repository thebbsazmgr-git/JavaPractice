import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ConfigLoader {
    // Method to read config file
    public static void readConfig() throws FileNotFoundException {
        File file = new File("config.txt");
        Scanner input = new Scanner(file);
        System.out.println("=== Config File Content ===");
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }

    // Method to create default config file
    public static void createDefaultConfig() {
        try {
            FileWriter writer = new FileWriter("config.txt");
            writer.write("app_mode=default\n");
            writer.write("theme=light\n");
            writer.write("version=1.0\n");
            writer.close();
            System.out.println("config.txt not found. Default file created.");

        } catch (IOException e) {
            System.out.println("Error creating config file: " + e.getMessage());
        }
    }
    static void main(String[] args) {

        try {
            readConfig();
        } catch (FileNotFoundException e) {
            createDefaultConfig();
        }
    }
}