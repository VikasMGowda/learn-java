public class Maxofthree 
{
    // static
    /*static int max(int x,int y,int z)
    {
      if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }
   
    public static void main(String[]args)
    {
        int a =10,b=20,c=35;
        int d =max(a,b,c);
        System.out.println(d);
    }*/

    // instance
    int max(int x,int y,int z)
    {
      if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }
   
    public static void main(String[]args)
    {
        Maxofthree ob1 = new Maxofthree();
        int a =10,b=20,c=35;
        int d =ob1.max(a,b,c);
        System.out.println(d);
    }
}
