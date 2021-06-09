package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public static Phonebook instance;
    public  static Phonebook getInstance(){
        if(instance == null){
            instance =  new Phonebook();
        }
        return instance;
    }


    private Phonebook() {

    }

     Scanner scanner = new Scanner(System.in);
    public  void addContact(Contact c){
        contacts.add(c);
    }
    public void showAllcontacts(){
        for(Contact c : contacts){
            c.toString();
        }
    }

    public  void findContact(String findname){
        for(Contact a : contacts){
            if(a.getName().equals(findname)){
                return a;
            }
        }
    }

    public void DeleteContact( String findname){
        Contact c = findContact(findname);
        contacts.remove(contacts);
    }


    public void SendMessage(String message){
        System.out.println("Enter");
         String name = scanner.next();
         if(name.equals("")){
             System.out.println("hmmm");
             SendMessage();
         }
         else

    }
}

