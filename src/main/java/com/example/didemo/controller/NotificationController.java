package com.example.didemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.didemo.service.NotificationService;

@RestController
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notify")
    public String sendNotification (@RequestParam(defaultValue="user@example.com") String to) {
        return notificationService.sendWelcomeMessage(to);
    }
}