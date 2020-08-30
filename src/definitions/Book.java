/*  Created by IntelliJ IDEA.
 *  User: Mayank Shrivastava
 *  Date: 24/08/20
 *  Time: 18:14
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = "";
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.authorName = "";
        this.ISBNNumber = "";
    }

    public Book() {
        this.bookName = "";
        this.authorName = "";
        this.ISBNNumber = "";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    @Override
    public String toString() {
        return String.format("Book name: %s, Author's name: %s, ISBN number of the book: %s", getBookName(), getAuthorName(), getISBNNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(ISBNNumber, book.ISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, ISBNNumber);
    }
}
