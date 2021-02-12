package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController implements Initializable
{
	private int start = 1;
	
	private String firstMove, strField1, strField2, strField3, letter;
	
	private boolean btnOneDisabled, btnTwoDisabled, btnThreeDisabled, btnFourDisabled, btnFiveDisabled,
	btnSixDisabled, btnSevenDisabled, btnEightDisabled, btnNineDisabled; // can be declared as an array of boolean disabled buttons
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		firstMove();	
	}
	
	public void firstMove()
	{
		Random rand = new Random();
		int random = rand.nextInt(2) + 1;
		
		if(random == 1)
			firstMove = "X";
		else
			firstMove = "O";
	}
	
	public boolean matches()
	{
		String one = btnOne.getText(), two = btnTwo.getText(), 
				three = btnThree.getText(), four = btnFour.getText(), 
				five = btnFive.getText(),	six = btnSix.getText(),
				seven = btnSeven.getText(), eight = btnEight.getText(),
				nine = btnNine.getText();
		
		if(one.equals(two) && one.equals(three))
		{
			letter = btnOne.getText();
			strField1 = "1";
			strField2 = "2";
			strField3 = "3";
			return true;
		}
		else if(one.equals(four) && one.equals(seven))
		{
			letter = btnOne.getText();
			strField1 = "1";
			strField2 = "4";
			strField3 = "7";
			return true;
		}
		else if(one.equals(five) && one.equals(nine))
		{
			letter = btnOne.getText();
			strField1 = "1";
			strField2 = "5";
			strField3 = "9";
			return true;
		}
		else if(two.equals(five) && two.equals(eight))
		{
			letter = btnTwo.getText();
			strField1 = "2";
			strField2 = "5";
			strField3 = "8";
			return true;
		}
		else if(three.equals(five) && three.equals(seven))
		{
			letter = btnThree.getText();
			strField1 = "3";
			strField2 = "5";
			strField3 = "7";
			return true;
		}
		else if(three.equals(six) && three.equals(nine))
		{
			letter = btnThree.getText();
			strField1 = "3";
			strField2 = "6";
			strField3 = "9";
			return true;
		}
		else if(four.equals(five) && four.equals(six))
		{
			letter = btnFour.getText();
			strField1 = "4";
			strField2 = "5";
			strField3 = "6";
			return true;
		}
		else if(seven.equals(eight) && seven.equals(nine))
		{
			letter = btnSeven.getText();
			strField1 = "7";
			strField2 = "8";
			strField3 = "9";
			return true;
		}
		else
			return false;
	}
	
	@FXML
	private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
	btnSeven, btnEight, btnNine;
	
	public void disableAllButtons()
	{
		txtMessage.setText(strField1+", "+strField2+" and "+strField3+" = "+letter+". Player "+letter+" wins!");
		btnOne.setDisable(true);
		btnTwo.setDisable(true);
		btnThree.setDisable(true);
		btnFour.setDisable(true);
		btnFive.setDisable(true);
		btnSix.setDisable(true);
		btnSeven.setDisable(true);
		btnEight.setDisable(true);
		btnNine.setDisable(true);
	}
	
	public boolean disabled()
	{
		if(btnOneDisabled == true && btnTwoDisabled == true && btnThreeDisabled == true && 
				btnFourDisabled == true && btnFiveDisabled == true && btnSixDisabled == true && 
				btnSevenDisabled == true && btnEightDisabled == true && btnNineDisabled == true)
			return true;
		else
			return false;
	}
	
	public void eventOne(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnOne.setText("X");
			else
				btnOne.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnOne.setText("O");
			else
				btnOne.setText("X");
		}
		start++;
		btnOne.setDisable(true);
		
		btnOneDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventTwo(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnTwo.setText("X");
			else
				btnTwo.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnTwo.setText("O");
			else
				btnTwo.setText("X");
		}
		start++;
		btnTwo.setDisable(true);
		
		btnTwoDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventThree(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnThree.setText("X");
			else
				btnThree.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnThree.setText("O");
			else
				btnThree.setText("X");
		}
		start++;
		btnThree.setDisable(true);
		
		btnThreeDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventFour(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnFour.setText("X");
			else
				btnFour.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnFour.setText("O");
			else
				btnFour.setText("X");
		}
		start++;
		btnFour.setDisable(true);
		
		btnFourDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventFive(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnFive.setText("X");
			else
				btnFive.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnFive.setText("O");
			else
				btnFive.setText("X");
		}
		start++;
		btnFive.setDisable(true);
		
		btnFiveDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventSix(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnSix.setText("X");
			else
				btnSix.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnSix.setText("O");
			else
				btnSix.setText("X");
		}
		start++;
		btnSix.setDisable(true);
		
		btnSixDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventSeven(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnSeven.setText("X");
			else
				btnSeven.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnSeven.setText("O");
			else
				btnSeven.setText("X");
		}
		start++;
		btnSeven.setDisable(true);
		
		btnSevenDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventEight(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnEight.setText("X");
			else
				btnEight.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnEight.setText("O");
			else
				btnEight.setText("X");
		}
		start++;
		btnEight.setDisable(true);
		
		btnEightDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	public void eventNine(ActionEvent e)
	{
		if(firstMove.equals("X"))
		{
			if((start % 2) != 0)
				btnNine.setText("X");
			else
				btnNine.setText("O");
		}
		else
		{
			if((start % 2) != 0)
				btnNine.setText("O");
			else
				btnNine.setText("X");
		}
		start++;
		btnNine.setDisable(true);
		
		btnNineDisabled = true;
		if(disabled())
			txtMessage.setText("T  I  E!");
		
		if(matches())
			disableAllButtons();
	}
	
	@FXML
	private TextField txtMessage;
}
