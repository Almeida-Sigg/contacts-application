import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactPractice {
    String directory = "data";
    String filename = "contact.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);

//    if (Files.notExists(dataDirectory)) {
//        Files.createDirectories(dataDirectory);
//    }
//
//    if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//    }
    public static void showMenu(){
        System.out.println( "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
    }





    public static void main(String[] args) {
        showMenu();

    }
}
