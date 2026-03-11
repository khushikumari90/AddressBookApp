package com.addressbook.addressbook.service;

import org.springframework.stereotype.Service;
import com.addressbook.addressbook.dto.ContactDTO;
import com.addressbook.addressbook.model.Contact;

@Service
public class AddressBookService {

    public Contact createContact(ContactDTO contactDTO) {
        return new Contact(contactDTO);
    }

}