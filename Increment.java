import java.util.*;
public class Increment 
{
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 20;
        System.out.println(count++); // 20
        System.out.println(count); // 21
        System.out.println(count++); // 21
        System.out.println(count++); //22
        System.out.println(count--); // 23
        System.out.println(count--); //22
        System.out.println(count); //21
        System.out.println(++count);// 22
        System.out.println(count); //22
        System.out.println(++count); // 23
        System.out.println(--count);//22
        System.out.println(--count);// 21
        System.out.println(count);//21
    }
    
}
