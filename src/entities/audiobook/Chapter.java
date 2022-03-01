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

    // return attributes of chapter
    public String printChapter() {
        return "[Chapter detail] Name: " + name + "Length (in minutes) : " + length;
    }
}
