package Program80;

import java.util.Scanner;

@SuppressWarnings("unused")
class LibraryItem {
    
    private static String bookAuthor, dvdAuthor, magazineAuthor, ISBN, bookTitle, dvdTitle, magazineTitle, itemID;
    protected static int bookAvailability, dvdAvailability, magazineAvailability;
    private static int issueNumber;
    protected static float duration;

    Scanner scan = new Scanner(System.in);

    @SuppressWarnings("static-access")
    protected LibraryItem(String ISBN, String author, String title, int availability) {
        bookTitle = title;
        bookAuthor = author;
        bookAvailability = availability;
        this.ISBN = ISBN;
    }

    protected String getBookTitle() {
        return bookTitle;
    }

    protected static String getBookAuthor() {
        return bookAuthor;
    }

    @SuppressWarnings("static-access")
    protected LibraryItem(String title, String itemID, String author, float duration, int availability) {
        dvdTitle = title;
        dvdAuthor = author;
        dvdAvailability = availability;
        this.duration = duration;
        this.itemID = itemID;
    }

    @SuppressWarnings("static-access")
    protected LibraryItem(int issueNumber, String title, String author, int availability) {
        magazineTitle = title;
        magazineAuthor = author;
        magazineAvailability = availability;
        this.issueNumber = issueNumber;
    }

    protected void borrow(String title) {

    }

    protected void returnItem(String title) {

    }

    LibraryItem() {

    }

    protected static String getDvdAuthor() {
        return dvdAuthor;
    }

    protected static String getMagazineAuthor() {
        return magazineAuthor;
    }

    protected static String getDvdTitle() {
        return dvdTitle;
    }

    protected static String getMagazineTitle() {
        return magazineTitle;
    }

    protected static int getBookAvailability() {
        return bookAvailability;
    }

    protected static float getDuration() {
        return duration;
    }

}