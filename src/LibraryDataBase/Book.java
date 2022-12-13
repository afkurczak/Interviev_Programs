package LibraryDataBase;

import java.time.LocalDate;
import java.util.Objects;

public class Book extends Object {
    Long bookId;
    String bookTitle;
    String bookIsbn;
    LocalDate bookReleaseTime;
    Author author;

    public Book(Long bookId, String bookTitle, String bookIsbn, LocalDate bookReleaseTime, Author author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookIsbn = bookIsbn;
        this.bookReleaseTime = bookReleaseTime;
        this.author = author;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public LocalDate getBookReleaseTime() {
        return bookReleaseTime;
    }

    public void setBookReleaseTime(LocalDate bookReleaseTime) {
        this.bookReleaseTime = bookReleaseTime;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(bookId, book.bookId) && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookIsbn, book.bookIsbn) && Objects.equals(bookReleaseTime, book.bookReleaseTime) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookTitle, bookIsbn, bookReleaseTime, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookReleaseTime=" + bookReleaseTime +
                ", author=" + author +
                '}';
    }
}
