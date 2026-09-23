public class Squareofnum 
{
    //static
    /*static int square(int x)
    {
        int result=x*x;
        return result;
    }
   
    public static void main(String[]args)
    {
        int a =10;
        int c = square(a);
        System.out.println(c);
    }*/

    // instance
    int square(int x)
    {
        int result=x*x;
        return result;
    }
   
    public static void main(String[]args)
    {
        Squareofnum obj1 = new Squareofnum();
        int a =10;
        int c =obj1.square(a);
        System.out.println(c);
    }
}

