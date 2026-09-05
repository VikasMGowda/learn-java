import java.util.*;
public class Weeks
{
public static void main(String[]args)
{
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the day :");
        String day = sc.nextLine();
        
        {
            if(day.equals("saturday") || day.equals("sunday") )
            {
                System.out.println("Holiday");
                
            }
            else
                {
                    System.out.println("weekday");
            }
        }
}    
}
