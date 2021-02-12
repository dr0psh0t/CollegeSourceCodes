package controller;

import java.net.URL;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MyController implements Initializable{

	ArrayList<Person> p = new ArrayList<Person>();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//lblLastName.setFont(new Font(25));
	}
	
	@FXML
	private Label lblLastName, lblAge, lblInformation, lblAddPerson, lblDeleteLabel;
	
	@FXML
	private TextField txtfLastName, txtfAge, txtfDeletedLastName;
	
	@FXML
	private TextArea txtaLastName, txtaAge;
	
	@FXML
	private Button btnClose, btnSortLastName, btnSortAge, btnDisplay, btnCollect, btnClear, btnDelete;
		
	public void sortLastNameAction(ActionEvent e)
	{
		if(!(p.size() == 0))
		{
			Collections.sort(p);
			display();
		}
		else
		{
			Alert box = new Alert(AlertType.INFORMATION);
			box.setTitle("Sort error");
			box.setContentText("Cannot sort empty list of persons");
			box.show();
		}
	}
	
	public void sortAgeAction(ActionEvent e)
	{
		if(!(p.size() == 0))
		{
			Collections.sort(p, new Person());
			display();
		}
		else
		{
			Alert box = new Alert(AlertType.INFORMATION);
			box.setTitle("Sort error");
			box.setContentText("Cannot sort empty list of persons");
			box.show();
		}
	}
	
	public void displayAction(ActionEvent e)
	{
		if(!(p.size() == 0))
			display();
		else
		{
			Alert box = new Alert(AlertType.INFORMATION);
			box.setTitle("Empty");
			box.setContentText("Empty persons list");
			box.show();
		}
	}
	
	private void display()
	{
		String strlastName = "", strAge = "";
		
		for(int x = 0; x <= p.size() - 1; x++)
		{
			strlastName += p.get(x).getLastName()+"\n";
			strAge += p.get(x).getAge()+"\n";
		}
		
		// set the textareas and display
		txtaAge.setText(strAge);
		txtaLastName.setText(strlastName);
	}
	
	public void collectAction(ActionEvent e)
	{
		if(!(txtfLastName.getText().equals("")) && !(txtfAge.getText().equals("")))
		{			
			// get values from textfields and initialize
			String lastName = txtfLastName.getText();
			int age = Integer.parseInt(txtfAge.getText());
			
			p.add(new Person(lastName, age)); // adding of persons
			
			display(); // void method to display information into text areas
			
			// clear the textfields
			txtfAge.setText("");
			txtfLastName.setText("");
		}
		else
		{
			Alert box = new Alert(AlertType.ERROR);
			box.setTitle("Incomplete");
			box.setContentText("Fill-up all fields!");
			box.show();
		}
	}
	
	public void deleteAction(ActionEvent e)
	{
		if(!(p.size() == 0))
		{
			if(!(txtfDeletedLastName.getText().equals("")))
			{
				String lastName = txtfDeletedLastName.getText();
				boolean remove = false;
				
				for(int x = 0; x <= p.size() - 1; x++)
				{
					if((p.get(x).getLastName().equals(lastName)))
					{
						p.remove(x);
						remove = true;
						break;
					}
				}
				
				if(remove)
					display();
				else
				{
					Alert box = new Alert(AlertType.ERROR);
					box.setTitle("Nonexistent lastname");
					box.setContentText("Lastname is not in the person's list");
					box.show();
				}
				
				txtfDeletedLastName.setText("");
			}
			else
			{
				Alert box = new Alert(AlertType.ERROR);
				box.setTitle("Incomplete");
				box.setContentText("Fill-up all fields!");
				box.show();
			}
		}
		else
		{
			Alert box = new Alert(AlertType.ERROR);
			box.setTitle("Empty");
			box.setContentText("Cannot delete empty persons list");
			box.show();
		}
	}
	
	public void clearAction(ActionEvent e)
	{
		txtaAge.setText("");
		txtaLastName.setText("");
	}
	
	public void closeAction(ActionEvent e)
	{
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.close();
	}

}
