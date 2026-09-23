/*1. Check Whether Age is Greater Than 60
Problem Statement: A government office wants to identify senior citizens eligible for
special benefits. Read a person's age and determine whether the person is a senior citizen. If
the age is greater than 60, display 'Senior Citizen'; otherwise display 'Not a Senior Citizen'.
Input: Age (integer)
Output: Senior Citizen
Sample Input: 65
Sample Output: Senior Citizen
Conditions / Constraints: Age is positive. Use only if.
Hints: Read age, compare with 60.*/

public class Workbook 
{
 public static void main(String[]args)
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the age : ");

        int age = sc.nextInt();

        if(age>60)
            {
            System.out.println("seniorcitizen");
            }*/

/*2. Student Pass/Fail
Problem Statement: Write a Java program to solve the problem: Student Pass/Fail. Design
the program using the concepts taught in class and display meaningful output.
Input: Marks
Output: Pass
Sample Input: 72
Sample Output: Pass
Conditions / Constraints: Marks 0-100. Use if-else.
Hints: Compare with 35.*/

/*Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks :");
int marks=sc.nextInt();

if(marks>35){
    System.out.println("pass");
}
else
    {
    System.out.println("fail");
}*/


/*3. Bank Loan Eligibility
Problem Statement: Write a Java program to solve the problem: Bank Loan Eligibility.
Design the program using the concepts taught in class and display meaningful output.
Input: Age, Salary
Output: Loan Approved
Sample Input: 25, 35000
Sample Output: Loan Approved
Conditions / Constraints: Age>=21 and Salary>=30000.
Hints: Use &&.*/

/*Scanner sc = new Scanner(System.in);
System.out.println("enter your Age :");
System.out.println("enter your Salary :");
int age =sc.nextInt();
int Salary = sc.nextInt();

if(age >= 25 && Salary >= 30000)
{
    System.out.println("Loan approved ");

}
else
    {
     System.out.println("Not eligible for loan");
}*/

/*User Login
Problem Statement: Write a Java program to solve the problem: User Login. Design the
program using the concepts taught in class and display meaningful output.
Input: Username, Password
Output: Login Successful
Sample Input: admin, java123
Sample Output: Login Successful
Conditions / Constraints: Use .equals().
Hints: Validate both */

/*Scanner sc = new Scanner(System.in);
System.out.println("username :");
System.out.println("Password :");
String username = sc.next();
String Password = sc.next();

if(username.equals("vikas") && Password.equals("Java123"))
{
    System.out.println("login successfull");
}
else
    {
System.out.println("Login failure");
}*/

/*5. Income Tax Slab
Problem Statement: Write a Java program to solve the problem: Income Tax Slab. Design
the program using the concepts taught in class and display meaningful output.
Input: Annual Income
Output: 20% Tax
Sample Input: 700000
Sample Output: 20% Tax
Conditions / Constraints: Use if-else-if.
Hints: Check slabs.*/

/*Scanner sc = new Scanner(System.in);
System.out.println("enter your annual income :");
int income = sc.nextInt();

if (income < 0)
{
    System.out.println("invalid income");
}else if(income <= 250000)
{
    System.out.println("10% tax");
}else if(income <= 500000)
{
    System.out.println("15% tax");
}else
{
    System.out.println("20 % tax");
}*/

/*
6. Vowel or Consonant
Problem Statement: Write a Java program to solve the problem: Vowel or Consonant.
Design the program using the concepts taught in class and display meaningful output.
Input: Character
Output: Vowel
Sample Input: a
Sample Output: Vowel
Conditions / Constraints: Accept upper/lower.
Hints: Compare vowels.*/

/*Scanner sc = new Scanner(System.in);
System.out.println("enter alphabet");
char ch =sc.next().toLowerCase().charAt(0);
if(Character.isLetter(ch))
{
    if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        System.out.println("It's a vowel");
    }
    else
    {
        System.out.println("It's a constraint");
    }
}else
{
    System.out.println("Not a alphabets");
}*/

/* 7. Print ASCII Values of A-Z
Problem Statement: Write a Java program to solve the problem: Print ASCII Values of A-Z.
Design the program using the concepts taught in class and display meaningful output.
Input: -
Output: A 65 ... Z 90
Sample Input: -
Sample Output: A 65 ... Z 90
Conditions / Constraints: Use loop.
Hints: Loop A to Z.*/

/*Scanner sc = new Scanner(System.in);
System.out.println("enter");
char ASCII = sc.next().charAt(0);


for (char ch = 65; ch<= 90 ; ch++)
{
System.out.println(ch+" "+(int) ch+" ");
} */

/*8. Countdown
Problem Statement: Write a Java program to solve the problem: Countdown. Design the
program using the concepts taught in class and display meaningful output.
Input: Starting Number
Output: 5 4 3 2 1
Sample Input: 5
Sample Output: 5 4 3 2 1
Conditions / Constraints: Use loop.
Hints: Decrement.*/

/*Scanner sc = new Scanner(System.in);
System.out.println(" enter the number");
int num = sc.nextInt();

for(int i=num; i>=1 ; i--)
{
    System.out.println(i+" " );
    
}*/

/*9. Days in Each Month
Problem Statement: Write a Java program to solve the problem: Days in Each Month.
Design the program using the concepts taught in class and display meaningful output.
Input: -
Output: Print all valid days
Sample Input: -
Sample Output: Print all valid days
Conditions / Constraints: Nested loops.
Hints: Outer month, inner day*/

 /*int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        // Outer loop: Months
        for (int i = 0; i < 12; i++) {

            System.out.println("\n" + months[i] + ":");

            // Inner loop: Days
            for (int j = 1; j <= daysInMonth[i]; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }*/
       /*10. Search First Match
Problem Statement: Write a Java program to solve the problem: Search First Match. Design
the program using the concepts taught in class and display meaningful output.
Input: Array, Target
Output: Found at index 2
Sample Input: 10 20 30 / 30
Sample Output: Found at index 2
Conditions / Constraints: Use break.
Hints: Stop at first match. */

      /* int[] arr = {10, 20, 30};
        int target = 30;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                break;
            }
        }*/

/*11. Power Using Method
Problem Statement: Write a Java program to solve the problem: Power Using Method.
Design the program using the concepts taught in class and display meaningful output.
Input: Base, Exponent
Output: 32
Sample Input: 2, 5
Sample Output: 32
Conditions / Constraints: Don't use Math.pow().
Hints: Repeated multiplication.*/


        /*static int power(int base, exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int answer = power(base, exponent);

        System.out.println("Power = " + answer);

        sc.close();  */  

        /*12. cube() Calls square()
Problem Statement: Write a Java program to solve the problem: cube() Calls square().
Design the program using the concepts taught in class and display meaningful output.
Input: Number
Output: 64
Sample Input: 4
Sample Output: 64
Conditions / Constraints: Reuse square().
Hints: cube=square*n */

        /*Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int cube = square * n;

        System.out.println("Cube = " + cube);*/

/*13. average() Calls sum()
Problem Statement: Write a Java program to solve the problem: average() Calls sum().
Design the program using the concepts taught in class and display meaningful output.
Input: Three Numbers
Output: 20
Sample Input: 10 20 30
Sample Output: 20
Conditions / Constraints: Reuse sum().
Hints: Average=sum/3*/    

/*Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int average = sum / 3;

        System.out.println("Average = " + average);*/

    /*14. areaOfSquare() Calls square()
Problem Statement: Write a Java program to solve the problem: areaOfSquare() Calls
square(). Design the program using the concepts taught in class and display meaningful
output.
Input: Side
Output: 36
Sample Input: 6
Sample Output: 36
Conditions / Constraints: Reuse square().
Hints: Area=side². */

/*Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");
        int side = sc.nextInt();

        int square = side * side;
        int area = square;

        System.out.println("Area of Square = " + area);*/

/*15. percentage() Calls totalMarks()
Problem Statement: Write a Java program to solve the problem: percentage() Calls
totalMarks(). Design the program using the concepts taught in class and display meaningful
output.
Input: Five Marks
Output: 80%
Sample Input: 80 70 90 60 100
Sample Output: 80%
Conditions / Constraints: Out of 500.
Hints: Reuse totalMarks().*/

  /*Scanner sc = new Scanner(System.in);

        System.out.print("Enter five marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int totalMarks = a + b + c + d + e;

        int percentage = (totalMarks * 100) / 500;

        System.out.println("Percentage = " + percentage + "%");*/

/*16. largest() Calls max() Twice
Problem Statement: Write a Java program to solve the problem: largest() Calls max()
Twice. Design the program using the concepts taught in class and display meaningful
output.
Input: Three Numbers
Output: 40
Sample Input: 25 40 35
Sample Output: 40
Conditions / Constraints: Call max() twice.
Hints: Compare result with third.*/

/*Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max1;

        if (a > b)
            max1 = a;
        else
            max1 = b;

        int max2;

        if (max1 > c)
            max2 = max1;
        else
            max2 = c;

        System.out.println("Largest = " + max2);*/
     
        
}
}

