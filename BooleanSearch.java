public class BooleanSearch
{
    static boolean binSearch(int[]nums, int key)
    {
    if(nums == null || nums.length == 0)
            return false;

        for(int i = 0; i < nums.length; i++)
        {
            if(key == nums[i])
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] nums = {5,1,8,9,10};
        int key = 8;

        boolean result = binSearch(nums,key);
        System.out.println(result);
    }
}