public class PalinorNot 
{
    // static
    /*static String num(int x)
    
    {
        int original = x;
        int reverse = 0;

        for(;x>0;x=x/10){
        int digit=x%10;
        reverse = reverse * 10 + digit;
        }

        if (original==reverse)
            return "Palindrome";
        else 
            return "Not palindrome";
    }
   
    public static void main(String[]args)
    {
        int a =123;
        String check =num(a);
        System.out.println(check);
    }*/

    // instance
    String num(int x)
    
    {
        int original = x;
        int reverse = 0;

        for(;x>0;x=x/10){
        int digit=x%10;
        reverse = reverse * 10 + digit;
        }

        if (original==reverse)
            return "Palindrome";
        else 
            return "Not palindrome";
    }
   
    public static void main(String[]args)
    {
        PalinorNot ob1 = new PalinorNot();
        int a =121;
        String check = ob1.num(a);
        System.out.println(check);
    }
}
