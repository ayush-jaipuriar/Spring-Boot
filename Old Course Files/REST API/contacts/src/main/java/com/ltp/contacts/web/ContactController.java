package com.ltp.contacts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/{id}")
    public ResponseEntity<Integer> getContactById(@PathVariable Integer id) {        
        int index = contactService.findIndexById(id);
        return new ResponseEntity<>(index, HttpStatus.OK);
    }

    @GetMapping("/contact") 
    public ResponseEntity<Contact> getDummyContact() {
        Contact contact = new Contact("1","Ayush","123");
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PostMapping("/saveContact")
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {
        contactService.saveContact(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

}
