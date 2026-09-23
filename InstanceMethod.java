public class InstanceMethod 
{
    int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    public static void main(String[]args)
    {
        int a =10 ,b =15;

        InstanceMethod max= new InstanceMethod();

        int c = max.max(a, b);
        System.out.println(c);
    }
}
