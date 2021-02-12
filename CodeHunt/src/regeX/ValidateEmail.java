package regeX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
//import javafx.stage.Stage;
import javafx.stage.*;

public class ValidateEmail extends Application{
	
	private Stage window;
	private Button btnOk = new Button("check");
	private TextField txtfEmail = new TextField();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);	
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window = arg0;
		window.setTitle("email verfier");
		window.setResizable(false);
		
		AnchorPane root = new AnchorPane();
		txtfEmail.relocate(20, 20);
		
		txtfEmail.setOnAction(event -> checkRegex(txtfEmail.getText()));
		
		btnOk.relocate(121, 55);
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				checkRegex(txtfEmail.getText());
			}
		});
		
		root.getChildren().addAll(txtfEmail, btnOk);
		
		Scene scene = new Scene(root, 220, 100);
		window.setScene(scene);
		window.show();
	}
	
	private void checkRegex(String regex)
	{
		//if(strEmail.matches("^((\\w+)|(\\d+)(@gmail.com)$"))	//	the matcher will only accepts words or/and numbers for now
		//if(regex.matches("^[a-zA-Z0-9\\.\\-_]{1,20}(@gmail|@yahoo).[a-zA-Z]{2,3}$"))
		//if(regex.matches("^[\\w\\.\\-_]{1,20}@[\\w]{1,20}.[a-zA-Z]{2,3}$"))
		if(regex.matches("^[\\w\\.\\-_]{1,20}@[\\w]{1,20}\\.[a-zA-Z]{2,3}$"))
			System.out.println("Valid address");
		else
			System.out.println("Not valid aaddress");
		
		/*
		 * other way to check pattern
		 * 
		//String pattern = "^[a-zA-Z0-9\\.\\-_]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]{2,3}$";
		String pattern = "^[a-zA-Z0-9\\.\\-_]{1,20}(@gmail|@yahoo).[a-zA-Z]{2,3}$";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(regex);
		
		if(m.matches())
			System.out.println("Valid gmail address");
		else
			System.out.println("Not Valid gmail address");
			*/
	}

}
