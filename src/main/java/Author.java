import java.io.Serializable;

public class Author implements Serializable {
    private String firstName;
    private String lastName;

    public Author () { }

    public Author(String firstName, String lastName){ }

    public void setFirstName(){
        this.firstName = firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    //getters and setters
}
