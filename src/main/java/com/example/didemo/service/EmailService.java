package com.example.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

    @Override
    public String sendMessage(String recipient, String message) {
        return "Email sent to " + recipient + ": " + message;
    }
}