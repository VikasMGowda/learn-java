public class InstanceWays 
{
     //1st no arg, no return
     void greet()
    {
        System.out.println("vikas");
    }
 
    // 2nd arg but return
    void printsum(int a,int b)
    {
        System.out.println("sum = "+ (a+b));

    }
    
    //3rd no arg but return
    int getnumber()
    {
        return 100;
    }
    
    //4th no arg but return
    int max(int x,int y)
    {
        if(x > y)
            return x;
        else
            return y;
            
    }

    public static void main(String[]args)
    {
        //1st result
        InstanceWays obj1 =new InstanceWays();
        obj1.greet();

        //2nd result
        InstanceWays obj2 = new InstanceWays();
        obj2.printsum(10,20);
        
        //3rd result
        InstanceWays obj3 = new  InstanceWays();
        int num = obj3.getnumber();
        System.out.println(num);

        //4th result
        InstanceWays obj4 = new InstanceWays();
        int largest =obj4.max(25,40);
        System.out.println(largest);

    }
}
