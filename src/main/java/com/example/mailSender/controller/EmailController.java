package com.example.mailSender.controller;

import com.example.mailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private EmailService  emailService;
    @PostMapping("/sendMail")
    public ResponseEntity<?> sendEmail(@RequestParam(value = "file", required = false)MultipartFile[] file, String to,String[] cc, String subject, String body){
        emailService.sendMail(file,to,cc,subject,body);
        return ResponseEntity.ok().body("Mail send Successfully");
    }
}
