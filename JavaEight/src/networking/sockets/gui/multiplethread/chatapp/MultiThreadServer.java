package networking.sockets.gui.multiplethread.chatapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiThreadServer extends Application
{
    private TextArea ta = new TextArea();

    private Map<Integer, Socket> clients = new HashMap<>();
    //private Map<Socket, Socket> clients = new HashMap<>();

    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new ScrollPane(ta));
        primaryStage.setTitle("MultiThreadServer");
        primaryStage.setScene(scene);
        primaryStage.show();

        new Thread(new Runnable() {
            @SuppressWarnings("resource")
			@Override
            public void run()
            {
                try
                {
                    ServerSocket serverSocket = new ServerSocket(8000);

                    while (true)
                    {
                        Socket socket = serverSocket.accept();

                        NewClient newClient = new NewClient(socket);

                        clients.put(socket.getPort(), socket);

                        new Thread(newClient).start();
                    }
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    class NewClient implements Runnable
    {
        private Socket socket;
        
        public NewClient(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run()
        {
            try
            {
                BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter outputToClient = null;

                while (true)
                {
                    String textClient = inputFromClient.readLine();

                    for (Iterator<Integer> iter = clients.keySet().iterator(); iter.hasNext();)
                    {
                        int key = iter.next();

                        Socket client = clients.get(key);

                        outputToClient = new PrintWriter(client.getOutputStream());

                        outputToClient.println(key + " - " + textClient);
                        
                        outputToClient.flush();
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}