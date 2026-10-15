public class Keycount 
{
    static int keycount(int...nums)
    {
        int  count = 0;
        for(int x : nums)
        {
            if(x == 20)
            {
            count++;
            }
        } 
        return  count;
    }
    public static void main(String[] args) {
        System.out.println("dispaly key count : " + keycount(20,10,20,20,40,50));
    }
}
