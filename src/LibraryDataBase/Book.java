package LibraryDataBase;

import java.time.LocalDate;
import java.util.Objects;

public class Book extends Object {
    private Long id;
    private String title;
    private String isbn;
    private LocalDate releaseTime;
    private Author author;

    Book(String bookTitle, String bookIsbn, LocalDate bookReleaseTime, Author author) {
        this.title = bookTitle;
        this.isbn = bookIsbn;
        this.releaseTime = bookReleaseTime;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Long getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getIsbn() {
        return isbn;
    }

    LocalDate getReleaseTime() {
        return releaseTime;
    }

    Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", releaseTime=" + releaseTime +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(isbn, book.isbn) && Objects.equals(releaseTime, book.releaseTime) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isbn, releaseTime, author);
    }

}
