public class LowertoUpper
{
public static char[] convertToUppercase(char[] arr) {
    char[] result = new char[arr.length];
    for (int i = 0; i < arr.length; i++) {
    
        if (arr[i] >= 'a' && arr[i] <= 'z') 
        {
            result[i] = (char) (arr[i] - 32);
        }
        else
        {
            result[i] = arr[i];
        }
    }
    return result;
}
public static void main(String[]args)
{
    char [] arr = {'a','p','p','l','e'};
    System.out.println(convertToUppercase(arr));
}
}
