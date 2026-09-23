public class Day19
{
    /*static void calculateBasic()
    {
        System.out.println("Total Salary");
    }

    static void calculatePF()
    {
        System.out.println("PF Amount");
    }

    static void calculateDA()
    {
        System.out.println("DA Deduct");
    }

    static void calculateTax()
    {
        System.out.println("Tax Deduct");
    }

    static void calculateSalary()
    {
        calculateBasic();
        calculatePF();
        calculateDA();
        calculateTax();

        System.out.println("Final Salary Credit");
    }

    public static void main(String[] args)
    {
        calculateSalary();
    }*/

// pass object
        static void update(int b[])
        {
            b[0]=100; //100,20,30,40
            System.out.println("inside update :"+b[0]);
        }






        public static void main(String[] args) 
        {
           int a[]={10,20,30,40};
           System.out.println("before method call :"+a[0]); //10
           update(a);

           System.out.println("After method call :"+a[0]); //100
        }
}