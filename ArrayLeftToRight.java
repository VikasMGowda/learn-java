public class ArrayLeftToRight
{
    //lefttoright
    static void printlefttoright(int [] nums) {
        System.out.println("");

        for(int i =0; i<nums.length; i++)
        {
        System.out.print(nums[i]+"-->");
        }
    }
// righttoleft
    static void printrighttoleft(int [] nums) {

        System.out.println("");
        for(int i =nums.length-1; i>=0; i--)
        {
        System.out.print(nums[i]+"-->");
        }
    }
// frombothsidetoend
    static void printfrombothsidestoend(int [] nums) 
    {
       
        int left =nums[0];
        int right = nums[nums.length-1];
        System.out.println(",");

        while(left <= right)
        {
            System.out.print(left+ " ");
            left++;
            System.out.print(right+ " ");
            right--;
        }
    }
 //fromcentertoend
    static void printfromcentertoend(int[]nums) 
    {
        System.out.println("");
        int left =0;
        int right=0; 

        if(nums.length %2 == 0)
        {
            left =(nums.length / 2)-1;
            right =nums.length / 2;
        }
        else
        {
             left = nums.length/2;
             right = nums.length/2;
        }
        
        while(left >= 0 && right <= nums.length )
        {
         System.out.print(nums[left] +" -->" +nums[right]+" -->");
         left--;
         right++;
        }
        
        
    }
    else
        {
             left = nums.length/2;
             right = nums.length/2;
        }
         while(left >= 0 && right <= nums.length )
         {
            if(left == right)
            {
                System.out.println(left+"");
            }else
            {
                System.out.print(nums[left] +" -->" +nums[right]+" -->");
                left--;
                right++;
            }
         }
    public static void  main(String[]args)
    {
    int nums[] = {1,2,3,4,5,6,7,8,9,10};
    printlefttoright(nums);
    printrighttoleft(nums);
    printfrombothsidestoend(nums);
    printfromcentertoend(nums);

    }
}