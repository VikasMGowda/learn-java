import java.util.*;

public class Day14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter two numbers start to end:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for( num1 = 2; num1 <= num2; num1 = num1 * 2)
        {
            System.out.println(num1);
        }*/

            // while loop
            /*System.out.println("Enter two numbers start to end:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            while(num1 <= num2)
            {
                System.out.println(num1=num1*2);
            }*/

            // do while
            /*int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Enter two numbers start to end:");
            do
            {
                System.out.println(num1 = num1*2);
            }
            while(num1 <= num2); */


/*System.out.println("enter the multiples ");
int num1 =sc.nextInt();
for(num1= 0; num1<=10; num1++) 
{
    System.out.println(num1);
    
}*/

//while
/*System.out.println("Enter two numbers start to end:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            while(num1 <= 10)
            {
                System.out.println(num1++);
            }*/

// do while
/*System.out.println("enter the multiples ");
int num1 =sc.nextInt();
do
{
    System.out.println(num1++); 
}                
while(num1 <= 10);*/

/*System.out.println("enter the number decrement by 100 to 10 ");
int num1 =sc.nextInt();
for(num1=100; num1 >= 10; num1-= 10) 
{
    System.out.println(num1);
    
}*/

//while
/*System.out.println("enter the number decrement by 100 to 10 ");
int num1 =sc.nextInt();
while(num1 >= 10)
{
    System.out.println(num1 -= 10);
}*/

//do while
/*System.out.println("enter the number decrement by 100 to 10 ");
int num1 =sc.nextInt();
do
{
    System.out.println(num1 -= 10);

}while(num1 >= 10);*/


/*System.out.println("enter the number decrement powers of 2");
int num1 = sc.nextInt();
for(num1  = 64; num1 >=2 ; num1= num1/2) 
{
    System.out.println(num1);
    
} */

    // while
    /*System.out.println("enter the number decrement powers of 2");
     int num1 = sc.nextInt();
     num1 =64;
     while(num1>=2)
     {
        System.out.println(num1= num1/2);

     }
     */

     // do while
    /*System.out.println("enter the number decrement powers of 2");
     int num1 = sc.nextInt();
     
     do { 
         System.out.println(num1 = num1/2);
     } while (num1 >=2);*/


/*System.out.println("enter the two numbers 1 to 1000");
int num1 = sc.nextInt();
for(num1 = 0; num1<=1000; num1+=10)
{
    System.out.println(num1);
}*/

//while
/*System.out.println("enter the two numbers 1 to 1000");
int num1 = sc.nextInt();
num1 =0;
while(num1<=1000)
    {
        System.out.println(num1+=10);
    }*/

//do while
System.out.println("enter the two numbers 1 to 1000");
int num1 = sc.nextInt();
do
{
    System.out.println(num1);
    num1+=10;
}while(num1<=1000);





    }
}