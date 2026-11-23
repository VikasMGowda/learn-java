import java.util.*;
public class GetLastAndFirst
{
    public static char[] getFirstLast(char[] arr)
    {
        char[] result = new char[2];

        result[0] = arr[0];
        result[1] = arr[arr.length - 1];

        return result;
    }

    public static void main(String[] args)
    {
        char[] arr = {'m', 'y', 'j', 'a', 'v','a'};
        char[] result = getFirstLast(arr);

        System.out.println(Arrays.toString(result));
    }
}
