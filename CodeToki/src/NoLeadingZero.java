import java.util.*;

public class NoLeadingZero
{
   static Scanner console = new Scanner(System.in);
   public NoLeadingZero()
   {
   }
   
   public static void main(String[] args)
   {
      NoLeadingZero prob = new NoLeadingZero();
      
      System.out.print("Input a number: ");
      String num = console.next();
      
      System.out.print("Reverse: "+prob.reverseNumber(num));
   }
   
   public String reverseNumber(String num)
   {
      String str = "";
      String strNum = "";
      for(int i = num.length() - 1; i >= 0; i--)
         str = str + num.charAt(i);
      
      boolean noZero = false;
      int x = 0;
      while(x <= str.length() - 1 && !noZero)
      {
         if(str.charAt(x) != '0')
         {
            for(int j = x; j <= str.length() - 1; j++)
               strNum = strNum + str.charAt(j);
            noZero = true;
         }
         else
            x++;
      }
      return strNum;
   }
}