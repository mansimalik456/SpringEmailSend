package com.emailSend.Serviceiml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.emailSend.service.EmailService;

@Service
public class EmailServiceImplementation implements EmailService {

	@Autowired private JavaMailSender mailSender;
	
	@Override
	public void sendSimpleEmail(String toEmail, String body, String subject) {
		// TODO Auto-generated method stub
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("mansi.malik@oodles.io");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		mailSender.send(message);
		System.out.println("Email Sent Successfully.......");
		
		
	}

}
