public class RelationalArray1
{
public static void numRelate(int[] array ,int num)
{
    for (int i = 0; i < array.length ; i++)
    {
        if(array[i] == 0)
        {
            System.out.println("empty");
        }
        if(num > array[i])
        {
            System.out.println(num +" > "+array[i]);
        }
        if(num == array[i])
        {
            System.out.println(num+" == "+ array[i]);
        }
        if(num < array[i])
        {
            System.out.println(num +" < " + array[i]);
        }
    }
}

    public static  void main (String[]args)
    {
        int [] arr = {50,20,10,40,30};
        int  num = 30;
        numRelate(arr, num);
    }
}
