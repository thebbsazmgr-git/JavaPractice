public class LibrarySystem {
    static void main(String[] args) {
        Searchable book1 = new EBook("Java", "Java is a programming language used for software development.");
        Searchable book2 = new PhysicalBook("Data Structures", 303);
        book1.search("Java");
        System.out.println();
        book2.search("Tree");
    }
}
