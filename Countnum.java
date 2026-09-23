public class Countnum
{
    // static
    /*static int num(int x)
    {
      int count;
    for(count =0; x>0; count++)
    {
        x=x/10;
        
    }
    return count;
    }

public static void main(String[]args)
{
    int a= 12345;
    int check = num(a);
    System.out.println(check);
}*/

// instance
int num(int x)
    {
    int count;
    for(count =0; x>0; count++)
    {
        x=x/10;
        
    }
    return count;
    }

public static void main(String[]args)
{
    Countnum ob1 = new Countnum();
    int a= 12345;
    int check = ob1.num(a);
    System.out.println(check);
}
}
