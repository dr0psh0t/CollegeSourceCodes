package controller;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MyController implements Initializable
{
	private int correct = 0, incorrect = 0;
	
	@FXML
	private ImageView imgViewChallenge, imgViewNeutral;
	
	@FXML
	private Label lblOperatorPlus;
	
	@FXML
	private RadioButton rdbtnGrade1, rdbtnGrade2, rdbtnAddition, rdbtnSubtraction;
	
	@FXML
	private TextField txtNum1, txtNum2, txtAnswer, txtCorrect, txtIncorrect, txtThisAnswer, txtError;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		generateRandom();
		imgViewChallenge.setVisible(true);
		imgViewNeutral.setVisible(false);
		txtAnswer.isHover();
	}
	
	public void check(ActionEvent e)
	{
		txtError.setText("");
		try
		{
			int answer, userAns;
			int num1, num2;
			
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			
			userAns = Integer.parseInt(txtAnswer.getText());
			
			if(rdbtnAddition.isSelected())
				answer = num1 + num2;
			else
				answer = num1 - num2;
			
			if(answer == userAns)
			{
				correct++;
				imgViewChallenge.setVisible(true);
				imgViewNeutral.setVisible(false);
				txtCorrect.setText(""+correct);
				txtAnswer.setText("");
				generateRandom();
			}
			else
			{
				incorrect++;
				imgViewChallenge.setVisible(false);
				imgViewNeutral.setVisible(true);
				txtIncorrect.setText(""+incorrect);
				txtAnswer.setText("");
			}
			txtThisAnswer.setText("");
		}
		catch(NumberFormatException e1)
		{
			txtError.setText("Illegal value");
			txtAnswer.setText("");
		}
	}
	
	public void generateRandom()
	{
		Random rand = new Random();
		int num1, num2;
		
		if(rdbtnGrade1.isSelected())
		{
			num1 = rand.nextInt(10) + 1;
			num2 = rand.nextInt(10) + 1;
		}
		else
		{
			num1 = rand.nextInt(99 - 10) + 10;
			num2 = rand.nextInt(99 - 10) + 10;
		}
		
		txtNum1.setText(""+num1);
		txtNum2.setText(""+num2);
	}
	
	public void tenToNinetyNine(ActionEvent e){
		generateRandom();
	}
	
	public void oneToTen(ActionEvent e){
		generateRandom();
	}
	
	public void addition(ActionEvent e){
		lblOperatorPlus.setText("+");
	}
	
	public void subtraction(ActionEvent e){
		lblOperatorPlus.setText("-");
	}
	
	@FXML
	private Button btnExit, btnShowAnswer;
	
	public void exitApplication(ActionEvent e)
	{
		Stage stage = (Stage) btnExit.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
	
	public void show(ActionEvent e)
	{
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());
		int answer;
		
		if(rdbtnAddition.isSelected())
			answer = num1 + num2;
		else
			answer = num1 - num2;
		
		txtThisAnswer.setText(""+answer);
	}
}
