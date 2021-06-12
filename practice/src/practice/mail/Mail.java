package practice.mail;

import java.util.Properties;

public class Mail {
	String host = "smtp.naver.com"; 
	String user = "ktko@naver.com"; 
	String password = "password";      
	
	Properties props = new Properties(); 
	props.put("mail.smtp.host", host); 
	props.put("mail.smtp.port", 587); 
	props.put("mail.smtp.auth", "true"); 
	
	Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() { 
			return new PasswordAuthentication(user, password); } }); 
	
	try { 
		MimeMessage message = new MimeMessage(session); 
		message.setFrom(new InternetAddress(user)); 
		message.addRecipient(Message.RecipientType.TO, new InternetAddress("ktko@ktko.com")); 
		message.setSubject("KTKO SMTP TEST1111"); 
		message.setText("KTKO Success!!");
		Transport.send(message); 
		System.out.println("Success Message Send"); 
		} catch (MessagingException e) { 
			e.printStackTrace(); }

    });



	
}
