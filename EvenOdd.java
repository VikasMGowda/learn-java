public class EvenOdd
{
    // static
    /*static String EvenOdd(int x)
    {
        if (x%2==0)
            return "even";
        else 
            return "odd";
    }
   
    public static void main(String[]args)
    {
        int a =10;
        String check =EvenOdd(a);
        System.out.println(check);
    }*/

    // instance
    String EvenOdd(int x)
    {
        if (x%2==0)
            return "even";
        else 
            return "odd";
    }
   
    public static void main(String[]args)
    {
        EvenOdd ob1 = new EvenOdd();
        int a =11;
        String check =ob1.EvenOdd(a);
        System.out.println(check);
    }    
}
