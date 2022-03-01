package entities.audiobook;

public class Chapter {
    // chapter attributes
    private String name;
    private int length;

    // chapter constructor
    public Chapter(String name, int length) {
        this.name = name;
        this.length = length;
    }

    // print attributes of chapter
    public void printChapter() {
        System.out.println("Chapter detail:");
        System.out.println("Name: " + name);
        System.out.println("Length (in minutes) : " + length);
    }
}
