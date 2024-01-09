package com.ltp.contacts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.service.ContactService;

@RestController
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
        Contact contact = new Contact("1", "Ayush", "123");
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

}
