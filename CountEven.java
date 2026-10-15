public class CountEven
{
    int coutEvennum(int[]nums)
    {
        if(nums == null || nums.length == 0)
            return -1;
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]%2 == 0)
                count++;
        }
        return count;
    }
    public static void main(String[]args)
    {
        int[] nums = {5,4,6,7,8};
        CountEven obj = new CountEven();

        int result = obj.coutEvennum(nums);

        System.out.println("Number of even elements: " + result);
    }
}
