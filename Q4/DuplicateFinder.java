import java.util.ArrayList;
public class DuplicateFinder {
    public static void main(String[] args) {
        // Creating an ArrayList for guest names
        ArrayList<String> guests = new ArrayList<>();
        // Adding names to the list
        guests.add("Bibisha");
        guests.add("Sita");
        guests.add("Magar");
        guests.add("Bibisha");
        guests.add("Gita");
        guests.add("Magar");
        System.out.println("Duplicate names are:");
        // Nested loops to find duplicates
        for (int i = 0; i < guests.size(); i++) {
            for (int j = i + 1; j < guests.size(); j++) {
                // Compare names
                if (guests.get(i).equals(guests.get(j))) {
                    System.out.println(guests.get(i));
                    break; // prevents printing same duplicate many times
                }
            }
        }
    }
}