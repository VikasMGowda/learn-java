public class SumofFirstandLast 
{
    public static int sumFirstAndLast(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return arr[0] + arr[arr.length - 1];
    }


    public static void main(String[] args) {
        int[] input = {8, 3, 9, -8};
        System.out.println(sumFirstAndLast(input)); 
    }
}