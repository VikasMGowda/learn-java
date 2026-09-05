import java.util.*;
public class Radix1 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");

        String num = sc.next(); // 127 now word it is
        boolean octal = true;
        
        for(int i =0; i <num.length()-1; i++)
            {
                char ch = num.charAt(i);
                if (ch < '0' || ch > '7')
                {
                    octal = false;
                    break;
                }
                if(octal)
                {
                    System.out.println("yes it is octal");
                    
                }else{
                    System.out.println("no it is not octal");
                }
            } 
    }    
}
