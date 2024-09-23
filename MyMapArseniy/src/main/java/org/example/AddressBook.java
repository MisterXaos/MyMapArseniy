package org.example;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {

    public Map<String, String > contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phone){
        contacts.put(name, phone);
    }

    public String getPhone(String name){
        return contacts.get(name);
    }


    public void removeContact(String name){
        contacts.remove(name);
    }

    //    Map<String, String> contacts = new HashMap<>();
//
//    public String name;
//    public int number;
//
//    public AddressBook(String name, int number) {
//        this.name = name;
//        this.number = number;
//    }
//
//    private String retnumber (int number){
//        return "+7 " + number;
//    }
//
//    public void addContact(String name){
//
//    }
//
//    public String getPhone(String name){
//        return "";
//    }
//
//    public void removeContact(String name){
//
//    }
//

}
