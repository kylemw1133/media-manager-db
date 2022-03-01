package entities.audiobook;

import java.util.*;
import entities.InventoryItem;

public class Audiobook extends InventoryItem {
    // audiobook's attributes
    private String name;
    private String reader;
    private int length;
    private int year;
    // author and chapters
    private Author author;
    private ArrayList<Chapter> chapters;

    // constructor for audiobook
    // first 4 : quant, form, loc, licnum are for inventoryitem super constructor
    // next 4 : name, reader, length, year are for audiobook attributes
    // neext 2 : author, chapters are related entities to audiobook
    public Audiobook(int quant, String form, String loc, long licNum, String name, String reader, int length,
            int year, Author author, ArrayList<Chapter> chapters) {
        super(quant, form, loc, licNum);
        this.name = name;
        this.reader = reader;
        this.length = length;
        this.year = year;
        this.author = author;
        this.chapters = chapters;
    }

    // prints :
    // inventory item attributes
    // audiobook attributes
    // author attributes
    // chapter attributes (for each and every chapter)
    @Override
    public void printAttributes() {
        System.out.println("Audiobook details: ");
        super.printAttributes();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Reader: " + reader);
        System.out.println("Length (in minutes): " + length);
        System.out.println("Year: " + year);
        this.author.printAuthor();
        for (Chapter c : chapters) {
            c.printChapter();
        }
    }

}
