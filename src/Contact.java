import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name,phoneNumber);
    }

    ArrayList<String> contactList = new ArrayList<String>();

    public ArrayList<String> getContactList() {
        return contactList;
    }

    public void addContacts(String names){
        contactList.add(names);
    }

    public void displayContactList() {
        System.out.println("Here is your list of contacts: ");
        for(int i = 0; i < contactList.size(); i++){
            System.out.println(i + " - " + contactList.get(i));
        }

    }

    public static void main(String[] args) {

    }

}
