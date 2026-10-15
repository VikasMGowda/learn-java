public class PassingMark
{
    static int examPassingMarks(int[] arr, int key)
    {
        if(arr == null || arr.length == 0)
            return -1;

        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= key)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={75,60,35,18,28,58};
        int marks = 35;

        int result = examPassingMarks(arr, marks);
        System.out.println(result);

    }
}
