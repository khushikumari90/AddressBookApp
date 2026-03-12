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

    // Add single contact
    @PostMapping("/contacts")
    public String createContact(@RequestBody ContactDTO contactDTO) {
        return service.createContact(contactDTO);
    }

    // Get all contacts
    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return service.getAllContacts();
    }
}