package ca.ucalgary.ensf380;

public class University {

	public static void main(String[] args) {
        Address address = new Address("123 Bear St", "Calgary", "AB", "T2N 1N4", "Canada");
        Professor prof = new Professor("Dr Areeb Ansari", "403-123-4567", "areeb.ansari2@ucalgary.ca", address, "P123", 90000);
        Student student1 = new Student("Monil Patel", "403-234-5678", "monil.patel2@ucalgary.ca", address, "30172624", prof, 49.0);
        Student student2 = new Student("Arsalan Baig", "403-345-6789", "arsalan.baig@ucalgary.ca", address, "30176639", prof, 75.0);

        System.out.println("Professor: " + prof.getName() + " with email: " + prof.getEmailAddress());
        System.out.println("Student 1: " + student1.getName() + ", Eligible to Enroll: " + student1.isEligibleToEnroll());
        System.out.println("Student 2: " + student2.getName() + ", Eligible to Enroll: " + student2.isEligibleToEnroll());
    }
}

	


