public class Maxnum
{
    /*static int max(int[]arr) 
    {
        int max = 0;
        for(int x : arr)
        {
        if(x > max)
        {
            max = x;
        }
        }
        return max; 
    }
    public static void main(String[]args)
    {
        int[] arr = {12,34,52,8};
        System.out.println(max(arr));
    }*/

    // instance method
    int max(int[]arr) 
    {
        int max = 0;
        for(int x : arr)
        {
        if(x > max)
        {
            max = x;
        }
        }
        return max; 
    }
    public static void main(String[]args)
    {
        Maxnum num1 =new Maxnum();
        int[] arr = {12,34,72,8};
        System.out.println(num1.max(arr));
    }

}
