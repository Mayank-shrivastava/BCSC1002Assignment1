/*  Created by IntelliJ IDEA.
 *  User: Mayank Shrivastava
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooks;

    public Student(String studentName, long universityRollNumber) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
    }

    public Student(int numberOfBooksIssued, Book[] issuedBooks) {
        this.issuedBooks = new Book[numberOfBooksIssued];
        for (int i = 0; i < numberOfBooksIssued; i++) {
            issuedBooks[i] = new Book();
        }
    }
}
