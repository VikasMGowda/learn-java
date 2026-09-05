import java.util.*;
public class Passwordcheck 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your login name :");
        String username = sc.nextLine();

        System.out.println("Enter your password :");
        String id = sc.nextLine();

        
    
            if(username.equals("vikas") && id.equals("12345") )
            {
                System.out.println("Verified");
                
            }
            else
                {
                    System.out.println("Not verified");
            }
        
    }
}
