package LibraryDataBase;

import java.beans.Expression;
import java.time.LocalDate;
import java.util.Objects;

public class Book extends Object {
    private Long id;
    private String title;
    private String isbn;
    private LocalDate releaseTime;
    private Author author;

    Book(String title, String isbn, LocalDate releaseTime, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.releaseTime = releaseTime;
        this.author = author;

        if (title == null || isbn == null || releaseTime == null) throw new IllegalArgumentException();
    }

    Book(Long id, String title, String isbn, LocalDate releaseTime, Author author) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.releaseTime = releaseTime;
        this.author = author;

        if (title == null || isbn == null || releaseTime == null) throw new IllegalArgumentException();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setReleaseTime(LocalDate releaseTime) {
        this.releaseTime = releaseTime;
    }

    public void setAuthor(Author author) {
        this.author = author;
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
                ", author: " + author +
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
