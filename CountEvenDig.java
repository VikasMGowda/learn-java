public class CountEvenDig 
{
    static int countEven(int [] arr)
    {
        int count = 0;
        for(int i=0; i< arr.length; i++)
        {
            int num  = arr[i];
            int countdigit = 0;
            while(num > 0)
            {
                int res = num %10;
                countdigit++;

                num = num/10;
            }
                if(countdigit %  2 == 0)
                {
                    count++;
                }
            
        }
        return count;
    }
    public static void main(String[] args)
    {
        int [] arr ={1,34,568956,453,890,10,651};
        System.out.println(countEven(arr));
    }
}
