import java.util;
public class Day23 
{
    static void show(int[] a) 
    {
        
    //for each 
    for(int x : a)
    {
        System.out.print(x + " ,");
    }
}


    public static void main(String[] args) 
    {
        show(new int[]{1,2,3,4}); // Anonymous array
    }
}
