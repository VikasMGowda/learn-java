
import java.util.*;

public class ForeachDemo
{
    void ForeachDemo(int a[])
    {
        for(int x : a)
        {
            x = x * 10;
        }
    }

    void display(int a[])
    {
        for(int x : a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter :" + " "+"element");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }


        ForeachDemo num1 = new ForeachDemo();
        System.out.println("original:");
        num1.display(a);

        System.out.println("orginal array :");
        num1.display(a);

        System.err.println("modify array :");
        num1.ForeachDemo(a);
        
    }
}
