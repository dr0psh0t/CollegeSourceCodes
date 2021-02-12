package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController
{
	final MyNumber myNum = new MyNumber();
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private ProgressBar pb;
	
	@FXML
	private ProgressIndicator pi;
	
	@FXML
	private Button plusButton, minusButton;
	
	
	@FXML
	public void initialize()
	{
		myNum.setNumber(0);
		myNum.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue)
			{			
				
				lblStatus.setText(Math.ceil(myNum.getNumber() * 10)+"");
			}
		});
		
		pb.progressProperty().bind(myNum.numberProperty());
		pi.progressProperty().bind(myNum.numberProperty());
	}
	
	public void increment(ActionEvent event)
	{
		myNum.setNumber(myNum.getNumber() + 0.1);
		
		//if((pb.progressProperty().get() + 0.1) > 1.0)
			//plusButton.setDisable(true);
	}
	
	public void decrement(ActionEvent event)
	{
		double num = myNum.getNumber() - 0.1;
		
		if(num < 0)
			minusButton.setDisable(true);
		else
			myNum.setNumber(num);
	}
}