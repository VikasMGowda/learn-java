import java.util.Scanner;

public class Twostr 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) 
            {
            System.out.println("Not same");
        } 
        else 
            {

            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();

            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);

            if (java.util.Arrays.equals(a, b)) 
                {
                System.out.println("Characters and count are same");
            } 
            else 
                {
                System.out.println("Characters and count are not same");
            }
        }
    }
}