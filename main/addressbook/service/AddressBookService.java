package com.addressbook.addressbook.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.addressbook.addressbook.dto.ContactDTO;
import com.addressbook.addressbook.model.Contact;

@Service
public class AddressBookService {

    private List<Contact> contacts = new ArrayList<>();

    // Add single contact (UC1)
    public String createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(contactDTO);
        contacts.add(contact);
        return "Contact added successfully";
    }

    // Get all contacts
    public List<Contact> getAllContacts() {
        return contacts;
    }

    // UC3: Update contact by first name
    public String updateContact(String firstName, ContactDTO updatedContactDTO) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                // Update all fields
                contact.setLastName(updatedContactDTO.getLastName());
                contact.setEmail(updatedContactDTO.getEmail());
                contact.setPhoneNumber(updatedContactDTO.getPhoneNumber());
                contact.setAddress(updatedContactDTO.getAddress());
                contact.setCity(updatedContactDTO.getCity());
                contact.setState(updatedContactDTO.getState());
                contact.setZip(updatedContactDTO.getZip());
                return "Contact updated successfully";
            }
        }
        return "Contact not found with first name: " + firstName;
    }
}