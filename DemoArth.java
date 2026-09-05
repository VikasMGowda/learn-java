public class DemoArth 
{
    public static void main(String[]args)
    {
       int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        // Arithematic operations
        System.out.println("Addition : "+ (a+b));
        System.out.println("Sub : "+ (a-b));
        System.out.println("Multi : "+ (a*b));
        System.out.println("Division : "+ (a/b));
        System.out.println("Modulas : "+ (a%b)); 

        //precedence
        int num1 = 5;
        int num2 = 43;
        int num3 = 20;

        System.out.println("Precedence :" +num1+num2*num3);
        System.out.println("Precedence :" +(num1+num2)*num3);
        System.out.println("Precedence :" +(num1-num2)+num3);
        System.out.println("Precedence :" +num1*(num2/num3));

        //unary
        int k = 10;
        int m = 15;

        System.out.println("unary");
        System.out.println(k++);
        System.out.println(m++);
        System.out.println(--k);
        System.out.println(--m);

        //binary 
        int l1 = 12;
        int l2 = 52;
        System.out.println("Binary");
        System.out.println(l1+l2);
        System.out.println(l1-l2);

        float d1 = 20.5f;
        float d2 = 3.6f;
        System.out.println(d1%d2);

        double j1 = 20.5;
        double j2 = 3.6;
        System.out.println(j1%j2);
    }    

}
