import java.io.Serializable;

public class Quote implements Serializable {
    private Author author;
    private String content;
    public Quote () { }

    public Quote (Author author, String content){
        this.author = author;
        this.content = content;
    }

    //getters and setters
    public void setAuthor(Author author) {
        this.author = author;
    }
    public Author getAuthor(Author author) {
        return author;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent(String content) {
        return content;
    }
}
