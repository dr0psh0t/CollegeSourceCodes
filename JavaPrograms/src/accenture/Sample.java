/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accenture;
import java.util.Scanner;
/**
 *
 * @author daryll
 */
public class Sample {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner con = new Scanner(System.in);        
        
        try
        {
            System.out.println("Enter first number: ");
            int num1 = con.nextInt();
        
            System.out.println("Enter second number: ");
            int num2 = con.nextInt();
            
            System.out.println("Quotient of two numbers is "+quo(num1, num2));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static int quo(int g, int j)
    {
        if((g == 0) && (j == 0))
            throw new ArithmeticException("Undefined!");
        else if((g == 0) && (j > 0))
            throw new ArithmeticException("Infinity!");
        else
            return g / j;
    }
}
