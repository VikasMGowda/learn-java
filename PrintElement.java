public class PrintElement
{
    static void printElement(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            System.out.println("Array is empty");
            return;
        }

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    System.out.println(arr[i] + " < " + arr[j]);
                }
                else if(arr[i] == arr[j])
                {
                    System.out.println(arr[i] + " == " + arr[j]);
                }
                else if(arr[i] > arr[j])
                {
                    System.out.println(arr[i] + " > " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40};
        printElement(arr);

    }
}