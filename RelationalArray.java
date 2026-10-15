public class RelationalArray
{
public static void numRelate(int[] array ,int num)
{
    for (int i =0; i < array.length ; i++)
    {
        if(array[i] == 0)
        {
            System.out.println("empty");
        }
        if(num > array[i])
        {
            System.out.println(num +">"+array[i]);
        }
        if(num == array[i])
        {
            System.out.println(num+"=="+ array[i]);
        }
        if(num < array[i])
        {
            System.out.println(num +"<" + array[i]);
        }
    }
}

    public static  void main (String[]args)
    {
        int [] arr = {10,20,30,40,50};
        int  num = 30;
    }
}
