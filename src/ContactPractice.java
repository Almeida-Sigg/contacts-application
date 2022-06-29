import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ContactPractice {

    static Scanner scanner = new Scanner(System.in);


    public static void showContacts() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/contact.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addContact(){
        System.out.println("What is the first name?");
        String first = scanner.next();
        System.out.println("What is the last name?");
        String last = scanner.next();
        System.out.println("What is the phone number?");
        String phoneNumber = scanner.next();
        String contact = String.format("%s %s | %s %n", first, last, phoneNumber);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/contact.txt",true));
            writer.write(contact);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchContacts() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name:");
            String inputName = scanner.next();
            BufferedReader Buffer = new BufferedReader(new FileReader(new File(
                    "data/contact.txt")));
            String line = null;
            String result = "";
            while ((line = Buffer.readLine()) != null) {
                    if (line.toLowerCase().contains(inputName)) {
                        System.out.println(line);
                        break;
                    }else{
                        System.out.println("Not found");
                        break;
                    }
                }
        } catch (Exception e) {
            System.out.print("" + e);
        }
    }

    public static void deleteContact() {
        System.out.println("Enter the contact name you would like to delete:");
        String userInput = scanner.next();
    }

    public static void showMenu() {
        System.out.println( "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
        System.out.println("Enter an option: (1 <----> 5)");
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Here are all of your contacts: \n");
            showContacts();
        }else if (userInput == 2) {
            addContact();
        }else if (userInput == 3) {
            searchContacts();
        }else if (userInput == 4) {
            deleteContact();
        }else if (userInput == 5) {
            System.out.println("Exiting program...");
        }
    }

    public static void main(String[] args) throws IOException {

//        showContacts();
//        addContact();
//        deleteContact();
//        searchContacts();



    }
}
