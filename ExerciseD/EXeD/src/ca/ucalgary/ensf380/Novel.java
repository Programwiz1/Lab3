package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    public Novel(String isbn, int pages, int publicationYear) {
        super(isbn, pages, publicationYear);
    }

    
    public String coverArt() {
        return "Method coverArt called from Novel";
    }
}
