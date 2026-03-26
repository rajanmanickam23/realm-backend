package com.realm.realm_backend.controller;

import com.realm.realm_backend.model.ContactMessage;
import com.realm.realm_backend.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {
    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ContactMessage> submitContactForm(@Valid @RequestBody ContactMessage message) {
        return ResponseEntity.ok(service.saveMessage(message));
    }
}
