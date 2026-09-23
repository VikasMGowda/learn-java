
import java.util.*;

public class Day18 
{
    //static void
    /*static void checkeven(int n)
    {
        if(n%2==0)
        {
            System.out.println("even");
        }
        else
            {
            System.out.println("Odd");
        }
    }
    
    

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        checkeven(n);
        
        
    }*/
       //static non void
/*boolean iseven(int n)
    {
        return(n%2==0);
    }
    
    

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int check =checkeven(n);
        
        
    }*/

            //instance void
     /*void checkeven(int n)
    {
        if(n%2==0)
        {
            System.out.println("even");
        }
        else
            {
            System.out.println("Odd");
        }
    }
    
    

    public static void main(String[] args) 
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();

        Day18 ob1= new Day18();
        ob1.checkeven(n);
        
        
    }*/

        //instance non void
        boolean iseven(int n)
    {
       return (n%2==0);
    }
    
    

    public static void main(String[] args) 
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();

        Day18 ob1= new Day18();
        ob1.iseven(n);
        
        
    } 
}
