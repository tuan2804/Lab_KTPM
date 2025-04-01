package bai_2;

abstract class Book {
    protected String title;
    protected String author;
    protected String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    public abstract void displayInfo();
}