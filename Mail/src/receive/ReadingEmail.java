package receive;

import java.util.*;
import javax.mail.*;

public class ReadingEmail
{
    public static void main(String[] args)
    {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        
        try
        {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            
            store.connect("imap.gmail.com", "xxrequiemofsoulsxx@gmail.com",
            "303EchoSlam");
            //store.connect("imap.mail.yahoo.com", "darylldagondon@yahoo.com",
            	//	"sidmannydiego");
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            
            System.out.println(inbox.getMessageCount());
            //	1737
            
            Message msg = inbox.getMessage(1735);
            Address[] in = msg.getFrom();
            
            System.out.println("FROM:" + in[0].toString());
            
            Multipart mp = (Multipart) msg.getContent();
            BodyPart bp = mp.getBodyPart(0);
            System.out.println("SENT DATE:" + msg.getSentDate());
            System.out.println("SUBJECT:" + msg.getSubject());
            System.out.println("CONTENT:" + bp.getContent());
        }
        catch (Exception mex){
            mex.printStackTrace();
        }
    }
}