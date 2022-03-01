package entities.audiobook;

public class Author {
    // author attributes
    private String name;
    private int authorID;

    // constructor
    public Author(String name, int authorID) {
        this.name = name;
        this.authorID = authorID;
    }

    // return attributes of author
    public String printAuthor() {
        return "[Author Details] Name: " + name + " Author_ID: " + authorID;
    }
}
