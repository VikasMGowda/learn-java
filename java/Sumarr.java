public class Sumarr
{
    /*static int findsum(int[]arr) 
    {
        int sum = 0;
        for(int x : arr){
            sum = sum + x;
    }
    return  sum;
}

    public static void main(String[] args) 
    {
      int [] arr ={1,3,5,8};
      System.out.println(findsum(arr));  
    }*/

      // instance method
      int findsum(int[]arr) 
      {
        int sum = 0;
        for(int x : arr)
            {
                sum = sum + x; 
            }
            return  sum;    
      }
      public static void main(String[] args) {
          Sumarr obj1 = new Sumarr();
          int[] arr = {23,45,56,68};
          System.out.println(obj1.findsum(arr));
      }
}
