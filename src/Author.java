import java.util.Objects;
public class Author {

    private String lastName;
    public Author(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastName, author.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }
}

