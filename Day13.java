public class Day13 
{
    public static void main(String[]args)
    {
        
        System.out.println("Scenario 1: Both string literals");
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("Scenario 2: Both string new objects");
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        
    
        System.out.println("Scenario 3: one string literals and one new object");
        String a1 = "Java";
        String a2 = new String("Java");

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2)); 
    }

}
