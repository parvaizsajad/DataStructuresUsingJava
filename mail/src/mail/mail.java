package mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail {
	public static void sendmail(String recepient) throws Exception, MessagingException, Exception {
	String email= "mirpaten@gmail.com";
	String pass="parvaiz99";
	
Properties pr=new Properties();
pr.put("mail.smtp.auth", "true");
pr.put("mail.smtp.starttls.enable", "true");
pr.put("mail.smtp.host", "smtp.gmail.com");
pr.put("mail.smtp.port", "587");


Session session=Session.getInstance(pr,new Authenticator() {
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		// TODO Auto-generated method stub
		return new PasswordAuthentication(email, pass);
	}
});

Message message=prepareMessage(session,email,recepient);
Transport.send(message);
System.out.println("message sent");
	}

	private static Message prepareMessage(Session session, String email, String recepient) throws AddressException, MessagingException,Exception {
		Message message =new MimeMessage(session);
		message.setFrom(new InternetAddress(email));
		message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
		message.setSubject("my first mail");
		String htmlCode=" <h1>the otp is 323828<br> <b>122313</b></h1>";
		message.setContent(htmlCode,"text/html");
	//	message.setText("hey there look my mail using java");
		System.out.println("the message has been sent");
		return message;
	}
public static void main(String[] args) throws Exception, Exception {
	mail.sendmail("parvaizsajjad@gmail.com");
}
}
