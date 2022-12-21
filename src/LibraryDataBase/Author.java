package LibraryDataBase;

import java.util.Objects;

public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (firstName == null || lastName == null) throw new IllegalArgumentException();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return  firstName + " "+ lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
