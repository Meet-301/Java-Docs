import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FileHandling {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        System.out.println("\nWelcome to File Handling Mechanism\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the file name to show it's content: ");
        String fileName = scan.nextLine();

        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            System.out.println("\nYour file content is");
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {

            if (fileName.equals("") || fileName.equals(" ")) {
                System.out.println("\nFile name is empty!!!\n");
            } else {
                System.out.println("\nYour entered file " + fileName + " isn't found!!!\n");
            }

        } catch (IOException e) {
            System.out.println("Exception " + e + " occurred!!!");
        }

    }
}