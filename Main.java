package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("User name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("Hello" + name);

        boolean sdk = true;
        while(sdk) {
            int choice;
            System.out.println("\t1. Manage Contacts" +
                    "\n\t2. Add a new contact \n\t3 EXit");


            while (true) {
                try {
                    choice = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }

            switch (choice) {
                case 1:

                    System.out.println("\t1. Show all contacts" +
                            "\n\t2. Add a new contact \n\t3 Search" +
                            "for a contact \n\\t4 Delete a contact " +
                            "\n\t5.Exit");
                    int sel = scanner.nextInt();
                    switch (sel){
                        case 1:

                            break;

                        case 2:
                            System.out.println("enter a name");
                            String newName = scanner.next();
                            System.out.println("enter a number");
                            String newnumber = scanner.next();
                            System.out.println("enter a mail");
                            String newmail = scanner.next();

                        case 3:
                            System.out.println("Enter contact");
                            String newcontatc = scanner.next();
                            Contact c = Phonebook.findContact(newcontatc);

                        case 4:
                            System.out.println("enter the contact number");
                            String deletecontact = scanner.next();
                            Contact c =
                            break;

                        case 5:
                            break;
                            }

                    int opt = scanner.nextInt();
                    switch (opt){
                        case 1:

                            break;

                        case 2:



                        case 3:
                            break;
                    }



            }


            }
        }
    }
}
