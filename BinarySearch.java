public class BinarySearch
{
    static int binarySearch(int[] array, int target)
    {
        if(array == null)
        {
            System.out.println("null");
            return - 1;
        }
        if(array.length == 0)
        {
            System.out.println("Array is empty");
            return - 1;
        }

        int leftIndex = 0;
        int rightIndex = array.length -1;

        while(leftIndex <= rightIndex)
        {
            int midIndex = leftIndex +(rightIndex - leftIndex) / 2;
        
        
        if(array[midIndex] == target)
        {
            return midIndex;
        }
        if(array[midIndex] < target)
        {
            leftIndex = midIndex + 1;
        }
        else
        {
            rightIndex = midIndex - 1;
        }
    }
    return -1;

}
public static void main(String[] args)
    {
        int [] array = {10,20,30,40,50,60,70};
        int target = 50;
        int result = binarySearch(array, target);
        if(result != -1)
        {
        System.out.println("target fount at index :"+ result);
        }
    else
    {
        System.out.println("target not found");
    }
}
}

