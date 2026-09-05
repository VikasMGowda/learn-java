

public class Day11 
{
    public static void main(String[]args)
    {
        // int age =25;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18)
        {
            System.out.println("Eligible");

        }
        else
            {
                System.out.println("Not Eligible");
            } */

        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age == 18)
        {
            System.out.println("Eligible");
        }
        else if(age < 18 && age  !=0){

        
            System.out.println("Not eligible");
        }
        else
        {
            System.out.println("Invalid");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Citizenship :");
        boolean citizen = sc.nextBoolean();
        
        if(age >= 18)
        {
            if(citizen) // nested if
            {
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not eligible");
            }
        }
        else
        {
            System.out.println("Age less than 18");
        }  


            /*System.out.println("Combine conditions using local operations :");
            int age = 25;
            boolean citizen = true;

            if(age >= 18 && citizen)
            {
                System.out.println("Eligible");

            }
            else
        {
            System.out.println("Not Eligible");

        }*/
    }
}
