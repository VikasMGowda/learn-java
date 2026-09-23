import java.util.*;
public class Fibonci1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fibonci series");
        int num =sc.nextInt();

        int a = 0, b=1, c;
        System.out.println(a+","+b+",");
        for(int i= 0;i<num-2;i++)
        {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }


    }
}
