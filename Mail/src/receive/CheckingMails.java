package receive;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class CheckingMails {
	
	public static void check(String host, String user, String password) 
		   {
		      try {

		      //create properties field
		      Properties props = new Properties();
		      props.setProperty("mail.store.protocol", "imaps");
		      
		      Session emailSession = Session.getDefaultInstance(props);

		      Store store = emailSession.getStore();

		      store.connect(host, user, password);

		      //create the folder object and open it
		      Folder emailFolder = store.getFolder("INBOX");
		      emailFolder.open(Folder.READ_ONLY);		      
		      
		      int count = emailFolder.getMessageCount();
		      int limit = count - 5;
		      Message msg;
		      Address[] in;
		     /* BodyPart bp = null;
		      Multipart mp;
		      String body = "";
		      Object content;
		      boolean ifString = false;*/
		      
		      while(count >= limit)
		      {
		    	  msg = emailFolder.getMessage(count);
		    	  in = msg.getFrom();
		    	  /*content = msg.getContent();
		    	  
		    	  if(content instanceof String)
		    	  {
		    		  body = (String) content;
		    		  ifString = true;
		    	  }
		    	  else if(content instanceof Multipart)
		    	  {
		    		  mp = (Multipart) content;
		    		  bp = mp.getBodyPart(0);
		    		  ifString = false;
		    	  }*/
		    	  
		    	  System.out.println("--------------------"+count+"--------------------");
		    	  System.out.println("FROM:" + in[0].toString());
		    	  System.out.println("SENT DATE:" + msg.getSentDate());
		          System.out.println("SUBJECT:" + msg.getSubject());
		          
		          /*if(!ifString)
		        	  System.out.println("CONTENT:" + bp.getContent());
		          else
		        	  System.out.println("CONTENT:" +body);	*/	    	  
		    	  count--;
		      }

		      //close the store and folder objects
		      emailFolder.close(false);
		      store.close();

		      } catch (NoSuchProviderException e) {
		         e.printStackTrace();
		      } catch (MessagingException e) {
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		   }

		   public static void main(String[] args) {
			   
			   /*
		      String host = "imap.mail.yahoo.com";
		      String username = "darylldagondon@yahoo.com";
		      String password = "sidmannydiego";
		      */
			   
			   String host = "imap.gmail.com";
			   String username = "xxrequiemofsoulsxx@gmail.com";
			   String password = "303EchoSlam";

		      check(host, username, password);

		   }

}
