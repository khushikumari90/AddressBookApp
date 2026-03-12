package com.addressbook.addressbook.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.addressbook.addressbook.dto.ContactDTO;
import com.addressbook.addressbook.model.Contact;

@Service
public class AddressBookService {

    // List to store all contacts
    private List<Contact> contacts = new ArrayList<>();

    // UC1: Add single contact
    public String createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(contactDTO);
        contacts.add(contact);
        return "Contact added successfully";
    }

    // Get all contacts
    public List<Contact> getAllContacts() {
        return contacts;
    }
}