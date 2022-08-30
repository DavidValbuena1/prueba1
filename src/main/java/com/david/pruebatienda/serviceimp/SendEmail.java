package com.david.pruebatienda.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(String to,String subject,String body) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		mailMessage.setFrom("david310702@gmail.com");
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		System.out.println(mailMessage);
		javaMailSender.send(mailMessage);
	}
}
