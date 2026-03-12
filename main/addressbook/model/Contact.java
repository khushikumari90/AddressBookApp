package com.addressbook.addressbook.model;

import com.addressbook.addressbook.dto.ContactDTO;

public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;

    // Constructor to map from DTO
    public Contact(ContactDTO dto) {
        this.firstName = dto.getFirstName();
        this.lastName = dto.getLastName();
        this.email = dto.getEmail();
        this.phoneNumber = dto.getPhoneNumber();
        this.address = dto.getAddress();
        this.city = dto.getCity();
        this.state = dto.getState();
        this.zip = dto.getZip();
    }

    // Public getters required for JSON serialization
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }

    
}