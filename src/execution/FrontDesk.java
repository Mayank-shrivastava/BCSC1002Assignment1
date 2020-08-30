/*  Created by IntelliJ IDEA.
 *  User: Mayank Shrivastava
 *  Date: 24/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;
import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice(1..4): ");
            studentInput = scanner.nextInt();
            String studentName;
            int numberOfBooksIssued;
            switch (studentInput) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the student:");
                    scanner.nextLine();
                    studentName = scanner.nextLine();
                    student.setStudentName(studentName);
                    System.out.println("Enter the number of books you want to issue:");
                    numberOfBooksIssued = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberOfBooksIssued; i++) {
                        System.out.println("Enter the name of the books you want to issue:");
                        Book book = new Book();
                        book.setBookName(scanner.nextLine());
                        student.addBook(book.getBookName());
                    }
                    break;
                case RETURN_BOOK:
                    String returnBookName;
                    System.out.println("Enter the name of the book that you want to return:");
                    scanner.nextLine();
                    returnBookName = scanner.nextLine();
                    student.doReturnBook(returnBookName);
                    break;
                case LIST_ISSUED_BOOKS:
                    student.listIssuedBooks();
                    break;
                default:
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
