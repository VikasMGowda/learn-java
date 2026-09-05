import java.util.*;
public class Triangle 
{
    public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
        int base,height,triangle;
        System.out.println("enter the height :");
        height  = sc.nextInt();
        System.out.println("enter the base");
        base = sc.nextInt();
        triangle = (base*height)/2;
        System.out.println("area of triangle :" +triangle);
    }
}
