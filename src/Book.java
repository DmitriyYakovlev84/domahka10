public class Book {
    private Author author;
    private String name;
    private String title;
    private int year;

    public Book(String name, String title, int year) {
        this.name = name;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}