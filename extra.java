package com.company;

public class extra {
    private  int number;
    private String message;
    private String contact;


    public extra(int number, String message, String contact) {
        this.number = number;
        this.message = message;
        this.contact = contact;
    }

    public  void getDetails(){
        System.out.println("Contact name" + contact
        + "\nMessage" + message
        + "\nId:" + number);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
