package itacademy.simpletasks;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Practice {
    Scanner scanner;
    private Contact[] contacts = new Contact[5];

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "your contact list:" + "\n" + Arrays.toString(contacts);
    }

    public void addContact() {
        int count = 0;
        String answer;
        while (count < contacts.length && contacts[count] != null) {
            count++;
        }
        if (count == contacts.length) {
            answer();
            answer = scanner.nextLine();
            if (answer.equals("Yes")) {
                deleteContact();
            } else System.out.println("Then ok");
        } else {
            System.out.println("Add the subscriber's name for contact:");
            String name = scanner.nextLine();
            System.out.println("Phone number for contact:");
            String phoneNumber = scanner.nextLine();
            Contact contact = new Contact(name, phoneNumber);
            contacts[count] = contact;
            System.out.printf("this %s has been Added", name);
            System.out.println();
        }
    }

    public void deleteContact() {
        System.out.println("You are going to delete a contact, write the name of the contact:");
        String name = scanner.nextLine();
        for (int i = 0; i <= contacts.length; i++) {
            if (Objects.equals(name, contacts[i].getName())) {
                System.out.println("The contact has been deleted");
                contacts[i] = null;
                return;
            }
        }
    }

    public void answer() {
//        System.out.println("Your contacts are filled \nif you want to add contact, you need to delete contact!\ndo You want to delete contact, white Yes/No?: ");
        System.out.println("Your contacts are filled");
        System.out.println("if you want to add contact, you need to delete contact!");
        System.out.println("do You want to delete contact, white Yes/No?: ");
    }
}
