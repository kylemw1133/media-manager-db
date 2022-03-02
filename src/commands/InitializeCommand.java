package commands;

import data.FakeDatabase;
import entities.*;
import entities.audiobook.Audiobook;

public class InitializeCommand {

	public static void exec() {
		FakeDatabase.getInstance().addItem(new Album(40, 2019, "Tyler, the Creator", 7, "album", "Dublin", 71841, "Igor"));
		FakeDatabase.getInstance().addItem(new Album(52, 2003, "Globnob", 42, "album", "Worthington", 871924, "The End is Nigh"));
		FakeDatabase.getInstance().addItem(new Album(38, 2004, "Steve Manschin", 5, "album", "Columbus", 123851, "Pretending is Ok"));
		FakeDatabase.getInstance().addItem(new Movie(126, 2015, 9, 92, "movie", "Hearthstone", 141812, "Keymaster"));
		FakeDatabase.getInstance().addItem(new Movie(95, 1999, 7, 54, "movie", "Jubrine", 891314, "Valley of the Lickey"));
		FakeDatabase.getInstance().addItem(new Movie(108, 1960, 2, 32, "movie", "Postmark", 78124, "Hallmaster Khan"));
		FakeDatabase.getInstance().addItem(new TVShow(8, 2020, 6, "tvshow", "Youngstown", 914052, "Breaking Bad"));
		FakeDatabase.getInstance().addItem(new TVShow(9, 2001, 82, "tvshow", "Cleveland", 589141, "Hall of Integrity"));
		FakeDatabase.getInstance().addItem(new TVShow(7, 2004, 5, "tvshow", "Mansfield", 576182, "Bad is Relative"));
		
		/*
		FakeDatabase.getInstance().addItem(new Audiobook(74, 2017, "Tyler, the Creator", 21, "album", "Dublin", 71841, "Igor"));
		FakeDatabase.getInstance().addItem(new Audiobook(28, 1972, "Tyler, the Creator", 9, "album", "Dublin", 71841, "Igor"));
		FakeDatabase.getInstance().addItem(new Audiobook(43, 1985, "Tyler, the Creator", 15, "album", "Dublin", 71841, "Igor"));
		*/
		
		FakeDatabase.getInstance().printItems();
	}
}
