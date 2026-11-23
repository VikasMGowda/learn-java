public class CountEven
{
    int evenCount = 0;
    int oddCount = 0;

    public static int[] countOddEven(int[] nums)
    {
        int oddCount = 0;
        int evenCount = 0;
        
        
        for (int i = 0; i < nums.length; i++)
            {
            if (nums[i] % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        
        // Return both counts as an array [odd, even]
        return new int[]{oddCount, evenCount};
    }
    public static void main(String[]args)
    {
        int[] nums = {5,4,6,7,8};
        CountEven obj = new CountEven();

        int result = obj.coutEvennum(nums);

        System.out.println("Number of even elements: " + result);
    }
}
