/*  Created by IntelliJ IDEA.
 *  User: Mayank Shrivastava
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private static final int NUMBER_OF_BOOKS_AVAILABLE = 10;
    private Book[] currentAvailableBooks;

    public Library(Book[] currentAvailableBooks) {
        this.currentAvailableBooks = currentAvailableBooks;
    }

    public Library() {
        this.currentAvailableBooks = new Book[NUMBER_OF_BOOKS_AVAILABLE];
        for (int i = 0; i < NUMBER_OF_BOOKS_AVAILABLE; i++) {
            currentAvailableBooks[i] = new Book();
        }
    }
}
