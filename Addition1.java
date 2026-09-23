public class Addition1
{
    //static
    /*static int sum(int x,int y)
    {
        int sum =x+y;
        return sum;
    }
   
    public static void main(String[]args)
    {
        int a =10,b=20;
        int c = sum(a,b);
        System.out.println(c);
    }*/
   
    
    // instance
    int sum(int x,int y)
    {
        int sum =x+y;
        return sum;
    }
   
    public static void main(String[]args)
    {
        Addition1 obj1 = new Addition1();
        int a =10,b=20;
        int c = obj1.sum(a,b);
        System.out.println(c);
    }

}
