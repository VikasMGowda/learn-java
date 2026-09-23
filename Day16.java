public class Day16 
{
    public static void main(String[]args)
    {
       /* for(int i=1; i<=5; i++)
            {
                for(int j =1; j<=5; j++)
                    {
                System.out.print(i+j+" ");
                }
                System.out.println();
            }*/

         /* int count = 0;
         for(int i =1; i<=5; i++)
            {
                for(int j =1; j<=5; j++)
                {
                    ++count;
                    System.out.format("%02d ",count);
                   // System.out.print(count + " ");
                }
                System.out.println();
            } */

    // pattern 3 
    /*int count = 0;  
    for (int i = 0; i <=5; i++) 
        {
        for(int j =0; j<=5; j++)
            {
                count++;
        System.out.print(count + " ");
        }
        System.out.println();
    } */ 

  // pattern 4
  /* 
    for (int i = 1; i <=5; i++) 
        {
        for(int j =1; j<=5-i+1; j++)
            {
               
        System.out.print(j + " ");
        }
        System.out.println();
    }   */     
      
        //pattern 5
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<=5; j++)
            {
                if(j>=i)
                {
                    System.out.print("*" );
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
      
    }
}
