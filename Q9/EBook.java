public class EBook implements Searchable{
    private String title;
    private String content;
    public EBook(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override
    public void search(String keyword) {
        System.out.println("Searching in EBook: " + title);

        if (content.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword found in eBook content.");
        } else {
            System.out.println("Keyword NOT found in eBook content.");
        }
    }
}
