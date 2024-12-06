package lv.rvt;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String titles, int pages, int publicationYear) {
        this.title = titles;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }

    public String getName(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
}
}
