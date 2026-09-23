

public class Pattern 
{
    public static void main(String[] args) 
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Display the numbers");

        for(int i = 1; i <= 4; i++)
        {

        for(int j = 1; j <= 4; j++)
        {
            System.out.print("("+ i +","+j+")");
        }
        System.out.println();*/

        /*for(int i = 1; i <= 1; i++)
        {

        for(int j = 1; j <= 4; j++)
        {
            System.out.print(j);
        }
        System.out.println();
       
    } */

    // while inside while
    /*int i= 1;

    while(i<=4)
        {
         int j =1;  
          
        
        while(j<=4)
            {
               
            System.out.print(j+ " " );
            j++;
            }
            
                System.out.println();
                i++;
            }*/

     // do-while inside do- while
     /*int i =1;
     do {
        int j=1;
        do { 
            System.out.print("* ");
            j++;
        } while (j<=4);
        System.out.println();
        i++;

        }while (i<=4);*/

    //for inside while
    /*int i =1;
    while (i<=4) { 
        for(int j=1; j<=4;j++){
            System.out.print("* ");
            
        }
     System.out.println();
    i++;
    }*/
    
// while and do-while
/*int i=1;
while(i<=4){
    int j =1;
    do { 
        System.out.print(j+" ");
        j++;
    } while (j<=4);
System.out.println();
i++;
}*/
  
// for and do while

/*for(int i=1; i<=4;i++)
    {
    int j =1;
    do { 
        System.out.print(j+" ");
        j++;
    } while (j<=4);
System.out.println();

}*/

// do-while and while
int i=1;
do { 
    int j=1;
    while (j<=4)
    {
        j++;
        System.out.print(j+" ");
    }
    System.out.println();
    i++;
} while (i<=4);

    }
}
    

