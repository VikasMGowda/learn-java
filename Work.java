public class Work 
{
    /* public static void  main (String[]args) */
    /*{
        int a = 10;
        int b = 2;
         int c = a/b;
        System.out.println(c);
        float base = 10.5f;
        float height = 3.1f;
        float area = base/height;
        System.out.println(area);

    }*/
   /* {
        System.out.println(86\5);
        System.out.println(68.4552\13.1);
    }*/
   /*{
    int a = 13/5;
    System.out.println(a);
    float value1 = 1489.2204f/3.12f;
    System.out.println(value1);
   }
   static int value1 = 35;
   Static int value2 = 2;
   static int result  = value1 / value2;
   public static void main(String[] args) {
       System.out.println(result);
   }
}*/
/*{
    public static void main(String[] args) 
{ 
 int a = 10; 
int b = 5 
IO.println("Sum: " + a + b);
int result = a / 0; 
String name = null; 
IO.println(name.length()); 
int[] numbers = {10, 20, 30}; 
IO.println(numbers[5]); 
int length = 10; 
int width = 5; 
int area = length + width; 
IO.println("Area: " + area);
 } 
} */ 

//Fix issue
 class ErrorRemove 
 { //Class name & file Name fixing 
 public static void main(String[] args) 
 { 
    int a = 10; 
    int b = 5 ;       //fixing Syntax error semicolon is 1 Tasks Day-7 26/Augmissing 
    System.out.println("Sum: " + (a + b)); //here Logical Error t hat +a+b =105 concatinate so (a+b) 
    int result = (a/b); //Exception in thread "main" jav a.lang.ArithmeticException: / by zero // 
    String name = null; 
    String name = "abc"; 
    System.out.println(name.length()); //Exception in thread "mai n" java.lang.NullPointerException
    int[] numbers = {10, 20, 30}; 
    System.out.println(numbers[2]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
    int length = 10; 
    int width = 5; 
    int area = length * width;   
    System.out.println("Area: " + area); 
} 
}