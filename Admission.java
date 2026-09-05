import java.util.*;
public class Admission
{
    public static void main(String[]args)
    {
        /*int marks = 85;
        boolean pass_exam = true;

        if(marks >=85 && pass_exam != true)
            {
                System.out.println("welcome for Admission");


        }
        else
            {
                System.out.println("Not eligible for above criteria");
            }*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks :");
        int marks = sc.nextInt();
        System.out.println("pass_exam :");
        boolean pass_exam = sc.nextBoolean();
        {
            if(marks >= 85 && pass_exam)
            {
                System.out.println("welcome for admission");
                
            }
            else
                {
                    System.out.println("Not eligible for above criteria");
            }
        }
    }
    
}
