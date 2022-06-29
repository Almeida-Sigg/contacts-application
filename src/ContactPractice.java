import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactPractice {
    static String directory = "data";
    static String filename = "contact.txt";
    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);

    String name;
    String number;


    public static void showContacts() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("contact.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showMenu(){
        System.out.println( "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
    }

    public static void writeToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("contact.txt"));

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






    public static void main(String[] args) {
// write to files, look into these.  May be an easier way for us to understand file IO?


        showContacts();
// Read from files



//        showMenu();

    }
}
