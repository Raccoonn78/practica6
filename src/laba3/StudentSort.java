package laba3;

public class StudentSort {
    private String firstName;
    private String lastName;
    private int recordsBook;

    public StudentSort(String firstName, String lastName, int recordsBook) {
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
