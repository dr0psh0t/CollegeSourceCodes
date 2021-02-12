package networking.sockets.gui.multiplethread.chatapp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.SocketImpl;

public class ServerClientSocket extends ServerSocket
{

	public ServerClientSocket(int port) throws IOException {
		super(port);
	}

	public CustomSocket accepts() throws IOException
	{
		if (isClosed())
		{
			throw new SocketException("Socket is closed");
		}
		
		if (!isBound())
		{
			throw new SocketException("Socket is not bound yet");
		}
		
		CustomSocket s = new CustomSocket((SocketImpl) null);
		
		implAccept(s);
		
		return s;
	}
}
