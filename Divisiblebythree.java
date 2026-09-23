public class Divisiblebythree 
{
    /*static void check(int[]arr)
    {
        for(int x : arr)
        {
            if(x % 3 == 0)
            {
                System.out.println(x);
            }
        }
    }
    
    public static void main(String[] args) 
    {
    int [] arr ={32,9,6,55,46,27,15};
    check(arr);    
    }*/

    // instane method
    void check(int[]arr)
    {
        for(int x : arr)
        {
            if(x % 3 == 0)
            {
                System.out.println(x);
            }
        }
    }
    
    public static void main(String[] args) 
    {
    Divisiblebythree obj1 = new Divisiblebythree();
    int [] arr ={32,9,6,55,46,27,15,3};
    obj1.check(arr);    
    }
}
