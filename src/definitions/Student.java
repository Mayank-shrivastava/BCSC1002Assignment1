/*  Created by IntelliJ IDEA.
 *  User: Mayank Shrivastava
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public Student() {
        this.studentName = "";
        this.universityRollNumber = 0;
        this.numberOfBooksIssued = 0;
        this.issuedBooks = new Book[0];
    }

    /**
     * This method is used to add book to the student issued book array.
     *
     * @param bookName The name of the book that we want to add to the student issued book array.
     */
    public void addBook(String bookName) {
        System.out.println(bookName + " book added to list of student issued books:");
    }

    /**
     * This method is used to return issued book.
     *
     * @param returnBookName The name of the book that you want to return.
     */
    public void doReturnBook(String returnBookName) {
        System.out.println(returnBookName + " returned back to the library:");
    }

    /**
     * This is used to return the list of all issued books.
     */
    public void listIssuedBooks() {
        for (Book issuedBook : issuedBooks) {
            System.out.println(issuedBook);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", issuedBooks=" + Arrays.toString(issuedBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(issuedBooks, student.issuedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(issuedBooks);
        return result;
    }
}
