import javax.swing.JOptionPane;

public class OutputExample
{
	public static void main(String[] args)
	{	
		String name = "";
		
		name = JOptionPane.showInputDialog("Input your name", name);
		
		if(name.equals(""))
			JOptionPane.showMessageDialog(null, "you didn't enter your name");
		else
			JOptionPane.showMessageDialog(null, "Your name is: "+name);
			
	}
}