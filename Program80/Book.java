package Program80;

import java.util.Scanner;

class Book extends LibraryItem {
    static int borrows, availability, returncounter;
    boolean borrowDetailsPrinted = false, returnDetailsPrinted = false;

    @Override
    protected void borrow(String title) {

        if (!getBookTitle().equals(title)) {
            System.out.println("\nOops!! Invalid book name entered!!!\n");
        } else {
            if (bookAvailability <= 0) {
                System.out.println("\nOops!! Book is currently unavailable!!!\n");
            } else {
                borrows++;
                bookAvailability--;
                if (!borrowDetailsPrinted) {
                    printDetails();
                }
            }

        }

    }

    @Override
    protected void returnItem(String title) {
        if (!getBookTitle().equals(title)) {
            System.out.println("\nOops!! Invalid return!!!");
        } else if (availability == bookAvailability) {
            System.out.println("\nBook is already in the library!!!");
        } else {
            bookAvailability++;
            returncounter++;
            if (!returnDetailsPrinted) {
                returnDetails();
            }
        }
    }

    void printDetails() {
        System.out.println("\nBook borrowed successfully!!");
        System.out.println("Book's Details are as Follows");
        System.out.println("Name: " + getBookTitle());
        System.out.println("Author: " + getBookAuthor());
        borrowDetailsPrinted = true;
    }

    void returnDetails() {
        System.out.println("\nBook returned successfully!!");
        System.out.println("Book Details are as Follows");
        System.out.println("Name: " + getBookTitle());
        System.out.println("Author: " + getBookAuthor());
        returnDetailsPrinted = true;
    }

    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {

        String author, title, ISBN;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter book details to add a new book");
        System.out.print("Name: ");
        title = scan.nextLine();
        System.out.print("Author: ");
        author = scan.nextLine();
        System.out.print("ISBN: ");
        ISBN = scan.nextLine();
        System.out.print("Availability: ");
        availability = scan.nextInt();

        if (title.equals("") || author.equals("") || ISBN.equals("")
                || availability <= 0) {
            System.out.println("Invalid details entered!!!");
            return;
        }

        LibraryItem book = new LibraryItem(ISBN, author, title, availability);
        Book b = new Book();
        b.borrow("Mere Khwab");
        b.borrow("Mere Khwab");
        b.borrow("Mere Khwab");
        b.borrow("Mere Khwab");
        b.returnItem("Mere Khwab");

        if (borrows > 1 && returncounter > 1) {
            System.out.println("\nYou've borrowed " + borrows + " books and returned "+returncounter+" books\n");
        } else if (borrows == 1 && returncounter == 1) {
            System.out.println("\nYou've borrowed 1 book and returned 1 book\n");
        } else if (borrows == 1 && returncounter == 0) {
            System.out.println("\nYou've borrowed 1 book and returned 0 book\n");
        } else if (borrows > 1 && returncounter == 0) {
            System.out.println("\nYou've borrowed " + borrows + " books and returned 0 book\n");
        } else if (borrows > 1 && returncounter == 1) {
            System.out.println("\nYou've borrowed " + borrows + " books and returned 1 book\n");
        }

    }
}