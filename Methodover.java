public class Methodover 
{
    int max(int X, int Y)
{
    if(X>Y)
    {
        return X;

    }else
    {
        return  Y;
    }
}    
    public static void main(String[]args)
    {
        Methodover obj1 = new Methodover();
        System.out.println(obj1.max(10,20));
    }
}
