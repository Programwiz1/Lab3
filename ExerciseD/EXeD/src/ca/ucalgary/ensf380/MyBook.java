package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Arsalan Baig Publishing", "24 Wolf Street");
        Author author = new Author("Monil Patel", "245 University Drive", 45);
        Contract contract = new Contract("2024-07-18", publisher, author);

        Novel novel = new Novel("2323449544", 300, 2023);
        Anthology anthology = new Anthology("9876543323", 500, 2022);

        System.out.println(contract.printContract());
        System.out.println(novel.coverArt());
        System.out.println(anthology.coverArt());
    }
}
