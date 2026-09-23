public class Oneobject 
{
     //1st no arg, no return
     void greet()
    {
        System.out.println("hii");
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
        Oneobject obj1 =new Oneobject();
        obj1.greet();

        //2nd result
        
        obj1.printsum(10,30);
        
        //3rd result
        
        int num = obj1.getnumber();
        System.out.println(num);

        //4th result
        
        int largest =obj1.max(25,40);
        System.out.println(largest);

    }
    
}
