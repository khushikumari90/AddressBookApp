package com.addressbook.addressbook.controller;

import org.springframework.web.bind.annotation.*;

import com.addressbook.addressbook.dto.ContactDTO;
import com.addressbook.addressbook.model.Contact;
import com.addressbook.addressbook.service.AddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private final AddressBookService service;

    public AddressBookController(AddressBookService service) {
        this.service = service;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Address Book";
    }

    @PostMapping("/create")
    public Contact createContact(@RequestBody ContactDTO contactDTO) {
        return service.createContact(contactDTO);
    }
}