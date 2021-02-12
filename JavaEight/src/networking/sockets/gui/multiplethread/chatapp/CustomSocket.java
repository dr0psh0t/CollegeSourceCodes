package networking.sockets.gui.multiplethread.chatapp;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;

public class CustomSocket extends Socket
{
    private String pcName;

    public CustomSocket(String server, int port, String pcName) throws IOException
    {
        super(server, port);
        this.pcName = pcName;
    }
    
    public CustomSocket(Object object) throws SocketException{
    	super((SocketImpl) object);
    }

    public String getPcName(){
        return pcName;
    }
}