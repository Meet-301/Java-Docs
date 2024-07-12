class Book {
    String title, author, isbn;
    static int totalBooks;
    boolean isBorrowed;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    { // This method will be called each time when you create the new instance(object) of class 
        totalBooks++;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed!!!");
        } else {
            System.out.println("Hurray!! You've borrowed a book named "+title);
            isBorrowed = true;
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope you enjoyed reading the book.. Thanks for returning!");
        } else {
            System.out.println("That book is already in the library");
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
    
    public static void main(String args[]) {
        Book jivanBook = new Book("Jivan", "M.K. Publications Pvt. Ltd.", "61");
        jivanBook.borrowBook();
        jivanBook.returnBook();
        System.out.println(getTotalBooks());
    }
}