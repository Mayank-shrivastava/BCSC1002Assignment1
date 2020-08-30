/*  Created by IntelliJ IDEA.
 *  User: Mayank Shrivastava
 *  Date: 24/08/20
 *  Time: 18:14
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

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

    public Book[] getCurrentAvailableBooks() {
        return currentAvailableBooks.clone();
    }

    public void setCurrentAvailableBooks(Book[] currentAvailableBooks) {
        this.currentAvailableBooks = currentAvailableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "currentAvailableBooks=" + Arrays.toString(currentAvailableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(currentAvailableBooks, library.currentAvailableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(currentAvailableBooks);
    }
}
