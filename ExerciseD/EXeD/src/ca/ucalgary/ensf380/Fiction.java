package ca.ucalgary.ensf380;

public abstract class Fiction extends Paperback {
    public Fiction(String isbn, int pages, int publicationYear) {
        super(isbn, pages, publicationYear);
    }

    public String genre() {
        return "Method genre called from Fiction";
    }
}

