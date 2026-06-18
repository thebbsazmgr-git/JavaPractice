public class PhysicalBook implements Searchable{
    private String title;
    private int indexPages;
    public PhysicalBook(String title, int indexPages) {
        this.title = title;
        this.indexPages = indexPages;
    }
    @Override
    public void search(String keyword) {
        System.out.println("Searching in Physical Book: " + title);
        // Simulated search (since physical books don't have digital content)
        if (keyword.length() <= indexPages) {
            System.out.println("Keyword possibly found in index section.");
        } else {
            System.out.println("Keyword not found in index section.");
        }
    }
}
