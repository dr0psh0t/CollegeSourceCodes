package javafxBasics;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleProperty d1 = new SimpleDoubleProperty(1);
		DoubleProperty d2 = new SimpleDoubleProperty(2);
		
		d1.bind(d2);
		
		System.out.println("d1 is "+d1.getValue()+" and d2 is "+d2.getValue());
		
		System.out.println("Set d2 value to 70.2");
		d2.setValue(70.2);
		
		System.out.println("d1 is "+d1.getValue()+" and d2 is "+d2.getValue());
	}

}
