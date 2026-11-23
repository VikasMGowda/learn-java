public class CountFunc
{
    static int count = 0;

    static void fun(int n)
    {
        if (n < 1)
        {
            return;
        }

        count++;
        fun(n - 1);
    }


    public static void main(String[] args)
    {
        fun(5);
        System.out.println("Count = " + count);
    }
}

