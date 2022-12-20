package LibraryDataBase;

public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;

            if (firstName == null || lastName == null){
                throw new IllegalArgumentException("Record cannot by null");
            }
        }
        catch (Exception exception){
            System.out.println("null author");
        }
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
}
