package com.addressbook.addressbook.model;
import com.addressbook.addressbook.dto.ContactDTO;
public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(ContactDTO dto) {
        this.firstName = dto.getFirstName();
        this.lastName = dto.getLastName();
        this.address = dto.getAddress();
        this.city = dto.getCity();
        this.state = dto.getState();
        this.zip = dto.getZip();
        this.phoneNumber = dto.getPhoneNumber();
        this.email = dto.getEmail();
    }

}