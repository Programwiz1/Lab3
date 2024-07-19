package ca.ucalgary.ensf380;


public abstract class Paperback extends Book {
    public Paperback(String isbn, int pages, int publicationYear) {
        super(isbn, pages, publicationYear);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}

