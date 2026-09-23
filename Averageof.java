public class Averageof
{
    /*static int check (int [] arr)
    {
        int average = 0;
        int sum = 0;
        for(int x : arr)
        {
           sum = sum + x;
        }
        average = sum / arr.length; 
        return average;
    }
    public static void main(String[]args)
    {
        int [] arr = {12,32,45,8};
        System.out.println(check(arr));
    }*/

 // instance method
int check (int [] arr)
    {
        int average = 0;
        int sum = 0;
        for(int x : arr)
        {
           sum = sum + x;
        }
        average = sum / arr.length; 
        return average;
    }
    public static void main(String[]args)
    {
        Averageof obj1 = new Averageof();
        int [] arr = {12,36,64,8};
        System.out.println(obj1.check(arr));
    }
}
