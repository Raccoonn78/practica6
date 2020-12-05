package laba2;
public class Student {
    private String firstName;
    private String lastName;
    private int recordsBook;

    public Student(String firstName, String lastName, int recordsBook) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.recordsBook = recordsBook;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getRecordsBook() {
        return recordsBook;
    }
}