package Program80;

import java.util.Scanner;

@SuppressWarnings({ "unused", "resource" })
class DVD extends LibraryItem {

    private static int borrows, availability, returncounter;
    private boolean borrowDetailsPrinted = false, returnDetailsPrinted = false;
    private static float duration;

    @Override
    protected void borrow(String title) {

        if (!getDvdTitle().equals(title)) {
            System.out.println("\nOops!! Invalid DVD Name Entered!!!");
        } else {

            if (dvdAvailability <= 0) {
                System.out.println("\nThat DVD is Currently Unavailable!!!\n");
            } else {
                borrows++;
                dvdAvailability--;
                if (returncounter == availability) {
                    returncounter--;
                }
                if (!borrowDetailsPrinted) {
                    printDetails();
                }
            }

        }

    }

    @Override
    protected void returnItem(String title) {
        if (!getDvdTitle().equals(title)) {
            System.out.println("Oops!! Invalid return!!!");
        } else if (borrows == 0) {
            System.out.println("DVD is already in the library!!!");
            return;
        } else {
            dvdAvailability++;
            returncounter++;
            borrows--;
            if (!returnDetailsPrinted) {
                returnDetails();
            }
        }
    }

    void printDetails() {
        System.out.println("\nDVD Borrowed Successfully!!");
        System.out.println("DVD Details are as Follows");
        System.out.println("Name: " + getDvdTitle());
        System.out.println("Author: " + getDvdAuthor());
        System.out.println("Duration: " + getDuration() + " hrs");
        borrowDetailsPrinted = true;
    }

    void returnDetails() {
        System.out.println("\nDVD returned successfully!!");
        System.out.println("DVD Details are as Follows");
        System.out.println("Name: " + getDvdTitle());
        System.out.println("Author: " + getDvdAuthor());
        System.out.println("Duration: " + getDuration() + "hrs\n");
        returnDetailsPrinted = true;
    }

    public static void main(String[] args) {

        String author, title, itemID;
        int availability;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter DVD Details");
        System.out.print("itemID: ");
        itemID = scan.nextLine();
        System.out.print("Name: ");
        title = scan.nextLine();
        System.out.print("Author: ");
        author = scan.nextLine();
        System.out.print("Duration: ");
        duration = scan.nextFloat();
        System.out.print("Availability: ");
        availability = scan.nextInt();

        if (title.equals("") || author.equals("") || itemID.equals("")
                || availability <= 0 || duration <= 0) {
            System.out.println("Invalid details entered!!!");
            return;
        }

        LibraryItem dvd = new LibraryItem(title, itemID, author, duration, availability);
        DVD newdvd = new DVD();
        newdvd.borrow("Sagar Kinare");
        newdvd.borrow("Sagar Kinare");
        newdvd.returnItem("Sagar Kinare");
        newdvd.returnItem("Sagar Kinare");
        newdvd.returnItem("Sagar Kinare");

        if (borrows > 1 && returncounter > 1) {
            System.out.println("\nYou've borrowed " + borrows + " DVDs and returned " + returncounter + " DVDs\n");
        } else if (borrows == 1 && returncounter == 1) {
            System.out.println("\nYou've borrowed 1 DVD and returned 1 DVD\n");
        } else if (borrows == 1 && returncounter == 0) {
            System.out.println("\nYou've borrowed 1 DVD and returned 0 DVD\n");
        } else if (borrows > 1 && returncounter == 0) {
            System.out.println("\nYou've borrowed " + borrows + " DVDs and returned 0 DVD\n");
        } else if (borrows > 1 && returncounter == 1) {
            System.out.println("\nYou've borrowed " + borrows + " DVDs and returned 1 DVD\n");
        } else if (returncounter > borrows) {
            System.out.println("\nYou've borrowed 0 DVD and returned all DVDs\n");
        } else {
            System.out.println("\nYou've borrowed " + borrows + " DVDs and returned " + returncounter + " DVDs\n");
        }

    }
}