package com.ltp.contacts.service;

import com.ltp.contacts.pojo.Contact;

public interface ContactService {

    public int findIndexById(Integer id);

    public void saveContact(Contact contact);
    
}
