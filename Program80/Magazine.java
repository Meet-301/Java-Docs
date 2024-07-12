package Program80;

import java.util.Scanner;

class Magazine extends LibraryItem {
    private static int borrows, availability, returncounter, issueNumber;
    private boolean borrowDetailsPrinted = false, returnDetailsPrinted = false;

    @Override
    protected void borrow(String title) {

        if (!getMagazineTitle().equals(title)) {
            System.out.println("\nOops!! Invalid Magazine Name Entered!!!");
        } else {

            if (magazineAvailability <= 0) {
                System.out.println("\nThat Magazine is Currently Unavailable!!!\n");
            } else {
                borrows++;
                magazineAvailability--;
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
        if (!getMagazineTitle().equals(title)) {
            System.out.println("Oops!! Invalid return!!!");
        } else if (borrows == 0) {
            System.out.println("Magazine is already in the library!!!");
            return;
        } else {
            magazineAvailability++;
            returncounter++;
            borrows--;
            if (!returnDetailsPrinted) {
                returnDetails();
            }
        }
    }

    void printDetails() {
        System.out.println("\nMagazine Borrowed Successfully!!");
        System.out.println("Magazine Details are as Follows");
        System.out.println("Name: " + getMagazineTitle());
        System.out.println("Author: " + getMagazineAuthor());
        borrowDetailsPrinted = true;
    }

    void returnDetails() {
        System.out.println("\nMagazine returned successfully!!");
        System.out.println("Magazine Details are as Follows");
        System.out.println("Name: " + getDvdTitle());
        System.out.println("Author: " + getDvdAuthor());
        returnDetailsPrinted = true;
    }

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        String author, title, itemID;
        int availability;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter Magazine Details");
        System.out.print("Issue Number: ");
        issueNumber = scan.nextInt();
        System.out.print("Name: ");
        title = scan.nextLine();
        System.out.print("Author: ");
        author = scan.nextLine();
        System.out.print("Availability: ");
        availability = scan.nextInt();

        if (title.equals("") || author.equals("") || issueNumber <= 0
                || availability <= 0) {
            System.out.println("Invalid details entered!!!");
            return;
        }

        LibraryItem l = new LibraryItem(availability, title, author, availability);
        Magazine magazine = new Magazine();
        magazine.borrow("Sagar Kinare");
        magazine.borrow("Sagar Kinare");
        magazine.returnItem("Sagar Kinare");
        magazine.returnItem("Sagar Kinare");
        magazine.returnItem("Sagar Kinare");

        if (borrows > 1 && returncounter > 1) {
            System.out.println("\nYou've borrowed " + borrows + " magazines and returned " + returncounter + " magazines\n");
        } else if (borrows == 1 && returncounter == 1) {
            System.out.println("\nYou've borrowed 1 magazine and returned 1 magazine\n");
        } else if (borrows == 1 && returncounter == 0) {
            System.out.println("\nYou've borrowed 1 magazine and returned 0 magazine\n");
        } else if (borrows > 1 && returncounter == 0) {
            System.out.println("\nYou've borrowed " + borrows + " magazines and returned 0 magazine\n");
        } else if (borrows > 1 && returncounter == 1) {
            System.out.println("\nYou've borrowed " + borrows + " magazines and returned 1 magazine\n");
        } else if (returncounter > borrows) {
            System.out.println("\nYou've borrowed 0 magazine and returned all magazines\n");
        } else {
            System.out.println("\nYou've borrowed " + borrows + " magazines and returned " + returncounter + " magazines\n");
        }

    }

}