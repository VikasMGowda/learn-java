import java.util.*;

public class Work1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter the number:");
        int num= sc.nextInt();
        int fact =1;
        
        for(int i=1; i<=num; i++)
            fact=fact*i;
        {
            System.out.println(fact);
            
        }*/
       
            //while
        /*System.out.println("Enter the number:");
        int num= sc.nextInt();
        int fact =1;
        int i = 1; 
            while(i<=num)
                {
            fact= fact*i;
            i++;
                System.out.println(fact);
            }*/

        //do while
        /*System.out.println("Enter the number:");
        int num= sc.nextInt();
        int fact =1;
        int i = 1; 
        do { 
            
            fact= fact*i;
            i++;
            
        } while (i<=num);
        System.out.println(fact);*/

        /* System.out.println("Enter a binary number:");
        int num = sc.nextInt();

        String binary = "";

        for (; num > 0; num = num / 2) {
            int remainder = num % 2;
            binary = remainder + binary;
        }

        System.out.println("Binary = " + binary);*/

        //while
        /*System.out.println("Enter a binary number:");
        int num = sc.nextInt();

        String binary = "";
        while(num > 0){
            int remainder = num % 2;
            binary = remainder + binary;
            num =num/2;

        }
        System.out.println("Binary ="); */

        // do while
        System.out.println("Enter a binary number:");
        int num = sc.nextInt();

        String binary = "";
        do
        {
            int remainder = num % 2;
            binary = remainder + binary;
            num =num/2;
        }while(num>0);
        System.err.println("Binary = "+binary);
        



        }    
}