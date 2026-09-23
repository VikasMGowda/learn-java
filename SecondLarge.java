public class SecondLarge
{
    /*static void check (int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x : arr)
        {
        if(x > largest)
        {
            second = largest;
            largest = x;
        }
        else if(x > second && x != largest)
        {
            second = x;
        }
        }
        System.out.println("secondlargest element :" + second);
    }
    public static void main(String[] args) 
    {
        int [] arr = {32,45,67,59,78,84,76};
        check(arr);
    }*/

    // instance method
    void check (int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x : arr)
        {
        if(x > largest)
        {
            second = largest;
            largest = x;
        }
        else if(x > second && x != largest)
        {
            second = x;
        }
        }
        System.out.println("secondlargest element :" + second);
    }
    public static void main(String[] args) 
    {
        SecondLarge obj1 = new SecondLarge();
        int [] arr = {32,45,67,59,84,76};
        obj1.check(arr);
    }    
}
