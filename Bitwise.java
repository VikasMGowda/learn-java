import java.util.*;
public class Bitwise 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 10;
        int y = 6;
        int z;
        System.out.println("AND:"+(x & y));
        System.out.println("OR:"+(x | y));
        System.out.println("XOR:"+(x ^ y));
        System.out.println("NOT:"+(~x));
        System.out.println("NOT y :"+(~y));
        
        System.out.println("Left shift ");
        int a = 10;
        System.out.println("Left Shift by 1 place:" +(a<<1));
        System.out.println("Left Shift by 2 place:" +(a<<2));
        System.out.println("Left Shift by 3 place:" +(a<<3));
        System.out.println("Left Shift by 4 place:" +(a<<4));

        System.out.println("Right shift ");
        int b = 20;
        System.out.println("Right Shift by 1 place:" +(b>>1));
        System.out.println("Right Shift by 2 place:" +(b>>2));
        System.out.println("Right Shift by 3 place:" +(b>>3));
        System.out.println("Right Shift by 4 place:" +(b>>4)); 

        System.out.println("Unsigned Right Shift ");
        int c = -10;
        System.out.println("Unsigned Right Shift by 1 place:" +(c>>>1));
        System.out.println("Unsigned Right Shift by 2 place:" +(c>>>2));
        System.out.println("Unsigned Right Shift by 3 place:" +(c>>>3));

        
    }
}
