package mail;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Gmail
{
	public static void main(String[] args)
	{
		try
		{
			Gmail email = new Gmail();
			String[] to = {"darylldagondon@yahoo.com", "dagondondaryll@yahoo.com"};
			
			email.sendMail("xxrequiemofsoulsxx@gmail.com", "303SuperNova","Java Mail", to);
			System.out.print("Message sent....");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	public void sendMail(String from, String password, String subject, String[] to) throws MessagingException
	{
		try
		{
			String host = "smtp.gmail.com";
			
			//	setup mail server(gmail server)
			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", password);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");
			
			Session session = Session.getDefaultInstance(props);
			MimeMessage mimeMessage = new MimeMessage(session);
			
			mimeMessage.setFrom(new InternetAddress(from));
			
			// now get the address of recipients address
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for(int i = 0; i < to.length; i++)
				toAddress[i] = new InternetAddress(to[i]);
			
			// now add all the toAddress elements to mimeMessage
			for(int i = 0; i < toAddress.length; i++)
				mimeMessage.addRecipient(RecipientType.TO, toAddress[i]);
			
			// add subject
			mimeMessage.setSubject(subject);
			
			//set message to mimeMessage
			mimeMessage.setText("During the holiday season it’s not unusual for both UPS and FedEx "
					+ "to show up at your door on an almost daily basis. You receive order confirmation "
					+ "and shipping notification emails for each delivery—and that's just what "
					+ "cybercriminals are counting on.");
			
			// Transport class to send email
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, password);
			transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
			transport.close();
		}
		catch(MessagingException exc){
			throw exc;
		}
	}
}