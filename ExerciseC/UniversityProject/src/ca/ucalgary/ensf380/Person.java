package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private static int lastPersonalNumber = 0;
    private int personalNumber;

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.personalNumber = ++lastPersonalNumber;
    }

    public abstract boolean hasValidAddress();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }
}
