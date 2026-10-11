package com.example.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String sendWelcomeMessage(String recipient) {
        return messageService.sendMessage(recipient, "Welcome to Spring Boot");
    }
}