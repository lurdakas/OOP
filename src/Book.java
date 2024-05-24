public class Book {


    private String title;
    private int pages;
    private int releaseYear;

    // empty constructor
    public Book() {

    }
    // full constructor

    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    // getter

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
        public int getPages() {
        return pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return this.releaseYear;
    }
    public void fullname() {
        System.out.println("Book Ttile: " + "[" + this.title + "]" + " Pages: " + "[" + this.pages + "]" + " Released in: " + "[" + this.releaseYear + "]");
    }



}
