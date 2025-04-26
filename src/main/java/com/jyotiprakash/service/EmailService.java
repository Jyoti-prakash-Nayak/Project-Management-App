package com.jyotiprakash.service;

import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;


public interface EmailService {

    public void sendEmailWithToken(String userEmail,String link) throws MessagingException;
}
