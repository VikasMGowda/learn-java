public class EvenCount 
{
    static int evencount(int...nums)
    {
      int count = 0;
      for(int x : nums)
      {
        if(x % 2 == 0)
        {
            count++;
        }
      }
      return count;
    }
    public static void main(String[] args) {
        System.out.println("enter number of count is : "  + evencount(10,9,4,8,7,5,64));
    }
}
