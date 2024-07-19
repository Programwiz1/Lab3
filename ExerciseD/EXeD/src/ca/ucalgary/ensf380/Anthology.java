package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    public Anthology(String isbn, int pages, int publicationYear) {
        super(isbn, pages, publicationYear);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }
}

