public class Vararg 
{
    static void show(int...a) 
    {
        System.out.println("Arguments");
        for (int i = 0 ; i < a.length; i++)
        {
            System.out.print(a[i]);
            if(i != a.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
    
    public static void main(String[] args)
    {
        show(15);
        show(15,16);
        show(15,16,17);
        show(15,16,17,18);
    }
}
