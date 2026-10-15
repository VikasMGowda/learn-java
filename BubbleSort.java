public class BubbleSort
{
    static void bubbleSort(int[]arr)
    {
        if(arr == null || arr.length == 0)
            System.out.println("Array is empty");

        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

        public static void printArray(int[]arr)
        {
            for(int value : arr)
            {
                System.out.print(value + ",");
            }
            System.out.println(" ");
        }
    
    public static void main(String[] args)
    {
        int[] arr = {-5,-4,-19,2,3};
        System.out.println("before Sorting");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After sorting");
        printArray(arr);

    }
}
