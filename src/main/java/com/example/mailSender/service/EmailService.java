package com.example.mailSender.service;

import org.springframework.web.multipart.MultipartFile;

public interface EmailService {
    void sendMail(MultipartFile[] file, String to, String[] cc, String subject, String body);
}
