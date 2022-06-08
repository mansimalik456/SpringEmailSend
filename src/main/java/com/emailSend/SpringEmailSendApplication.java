package com.emailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.emailSend.service.EmailService;

@SpringBootApplication
public class SpringEmailSendApplication {

	@Autowired EmailService emailService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailSendApplication.class, args);
		
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		emailService.sendSimpleEmail("mansi.malik@oodles.io","This is Email Body","This is email subject");
	}

}
