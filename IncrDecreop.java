import java.util.*;
public class IncrDecreop
{
       public static void main(String[]args)
       {
        Scanner sc = new Scanner(System.in);
        int num1 = 10;
        System.out.println(num1++ + 5);
        System.out.println(num1++ + ++num1);
        System.out.println(num1++ + num1++);
        System.out.println(num1);
       } 
}
