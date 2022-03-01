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

    // print attributes of author
    public void printAuthor() {
        System.out.println("Author Details");
        System.out.println("Name: " + name);
        System.out.println("Author_ID: " + authorID);
    }
}
