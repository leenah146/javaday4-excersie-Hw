//3
public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName(String name) {
        return name;
    }

    public String getEmail(String Email) {
        return Email;
    }

    public void SetEmail(String Email) {
        this.email = Email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
