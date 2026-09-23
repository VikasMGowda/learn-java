public class Countof
{
    /*static void count(int[] arr){
    int positive = 0;
    int negative = 0;
    int zero = 0;

    for(int x : arr)
    {
        if (x > 0)
        {
            positive++;
           
        }else if (x < 0) 
            {
                negative++;
            
        }
        else
            {
            zero++;
        }
    }
         System.out.println("postive :" + positive);
        System.out.println("negative :" + negative);
        System.out.println("zero :" + zero );
        
    }

    public static void main(String[]args)
    {
        int[] arr = {-2,0,6,-14,24,0,8};
       count(arr);
    }*/

       // instance method
       void count(int[] arr){
    int positive = 0;
    int negative = 0;
    int zero = 0;

    for(int x : arr)
    {
        if (x > 0)
        {
            positive++;
           
        }else if (x < 0) 
            {
                negative++;
            
        }
        else
            {
            zero++;
        }
    }
         System.out.println("postive :" + positive);
        System.out.println("negative :" + negative);
        System.out.println("zero :" + zero );
        
    }

    public static void main(String[]args)
    {
        Countof obj1 = new Countof();
        int[] arr = {-2,0,6,-14,24,0,8};
       obj1.count(arr);
    }
} 