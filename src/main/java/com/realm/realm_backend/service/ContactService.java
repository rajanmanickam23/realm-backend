package com.realm.realm_backend.service;

import com.realm.realm_backend.model.ContactMessage;
import com.realm.realm_backend.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactMessageRepository repository;

    public ContactService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    public ContactMessage saveMessage(ContactMessage message) {
        return repository.save(message);
    }
}
