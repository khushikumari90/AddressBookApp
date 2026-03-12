package com.addressbook.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.addressbook.addressbook.dto.ContactDTO;
import com.addressbook.addressbook.model.Contact;
import com.addressbook.addressbook.service.AddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    // UC1: Add single contact
    @PostMapping("/contacts")
    public String createContact(@RequestBody ContactDTO contactDTO) {
        return service.createContact(contactDTO);
    }

    // Get all contacts
    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return service.getAllContacts();
    }

    // UC3: Update contact by first name
    @PutMapping("/contacts/{firstName}")
    public String updateContact(
            @PathVariable String firstName,
            @RequestBody ContactDTO contactDTO) {
        return service.updateContact(firstName, contactDTO);
    }

    // UC4: Delete contact by first name (API)
    @DeleteMapping("/contacts/{firstName}")
    public String deleteContact(@PathVariable String firstName) {
        return service.deleteContactByName(firstName);
    }
}