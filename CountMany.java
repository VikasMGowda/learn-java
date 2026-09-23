public class CountMany 
{
    /*static void count(int[]arr, int num)
    {
        int count = 0;
        for(int x : arr)
        {
            if (x == num)
            {
                count++;
            }
        }
        System.out.println(num +"occurence :" + count +"times");

    }
    public static void main(String[] args) 
    {
        int [] arr = {3,4,5,2,4,5,8,7};
        count(arr, 4);
    }*/

    // instance method
    void count(int[]arr, int num)
    {
        int count = 0;
        for(int x : arr)
        {
            if (x == num)
            {
                count++;
            }
        }
        System.out.println(num +"occurence :" + count +"times");

    }
    public static void main(String[] args) 
    {
        CountMany obj1 = new CountMany();
        int [] arr = {3,4,5,2,4,5,8,7};
        obj1.count(arr, 4);
    }    
}
