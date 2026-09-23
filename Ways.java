public class Ways 
{
    //1st no arg, no return
    static void greet()
    {
        System.out.println("vikas");
    }
 
    // 2nd arg but return
    static void printsum(int a,int b)
    {
        System.out.println("sum = "+ (a+b));

    }
    
    //3rd no arg but return
    static int getnumber()
    {
        return 100;
    }
    
    //4th no arg but return
    static int max(int x,int y)
    {
        if(x > y)
            return x;
        else
            return y;
            
    }

    public static void main(String[]args)
    {
        //1st result
        greet();

        //2nd result
        printsum(10,20);
        
        //3rd result
        int num = getnumber();
        System.out.println(num);

        //4th result
        int largest =max(25,40);
        System.out.println(largest);

    }
}
