package networking.sockets.gui.multiplethread.modify;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Application
{
    PrintWriter toServer = null;
    BufferedReader fromServer = null;

    @SuppressWarnings("resource")
	@Override
    public void start(Stage primaryStage)
    {
        //  panel p to hold the label and text field
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a radius: "));

        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);

        BorderPane mainPane = new BorderPane();
        //  text arae to display contents
        TextArea ta = new TextArea();
        mainPane.setCenter(new ScrollPane(ta));
        mainPane.setTop(paneForTextField);

        //  createa a scene and place it in the stage
        Scene scene = new Scene(mainPane, 450, 200);
        primaryStage.setTitle("Client");
        primaryStage.setScene(scene);
        primaryStage.show();

        try
        {
            //Socket socket = new Socket("localhost", 8000);
        	Socket socket = new Socket("localhost", 8000);

            toServer = new PrintWriter(socket.getOutputStream());
            toServer.flush();
            fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            new Thread(new Runnable() {
                @Override
                public void run()
                {
                    while (true)
                    {
                        try
                        {
                            String serverReply = fromServer.readLine();

                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    ta.appendText(serverReply + '\n');
                                }
                            });
                        }
                        catch (IOException e){
                            System.err.println(e.toString());
                        }
                    }
                }
            }).start();
        }
        catch (IOException ex) {
            ta.appendText(ex.toString());
        }

        tf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                String text = tf.getText();
                toServer.println(text);
                toServer.flush();
            }
        });
    }

    public static void main(String[] args){
        launch(args);
    }
}