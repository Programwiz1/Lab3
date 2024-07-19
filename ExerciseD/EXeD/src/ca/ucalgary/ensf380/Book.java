package ca.ucalgary.ensf380;


public abstract class Book {
    private String isbn;
    private int pages;
    private int publicationYear;

    public Book(String isbn, int pages, int publicationYear) {
        this.isbn = isbn;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public abstract String coverArt();

    // Getters and Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

