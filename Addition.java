import java.until.*;
import java.util.Scanner;
public class Addition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter first number");
        a = sc.nextInt();
        System.out.println("enter second number");
        b =  sc.nextInt();
        c= a+b;
        System.out.println("sum of two numbers :"+c);


        
    }
}
