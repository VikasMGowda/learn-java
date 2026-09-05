public class Day8 
{
    public static void main(String[]args)
    {
        byte a =10 ;
        byte b =20 ;
        //byte c =a+b; --->wrong,lossy conversion 
        int c = a+b; // type conversion
        System.out.println(c);

        byte value1 = 10;
        short value2 = 100;
        int value3 = value1*value2;
        System.out.println(value3);

        short a1 = 201;
        int a2 = 89;
        int a3 = a1 - a2;
        System.out.println(a3);

        int p = 3456;
        int q = 32;
        int r = p/q;
        System.out.println(r);

        int i = 3444;
        float j = 56.2f;
        float k = 3456+56.2f;
        System.out.println(k);
        
        float b1 = 34.02f;
        long  b2  = 45000000l;
        float b3 = b2/b1;
        System.out.println(b3);
        
        int c1 =45;
        long c2 = 3200000l;
        long c3 = c1+c2;
        System.out.println(c3);

        long d1 = 6830003l;
        double d2 = 3456.2;
        double d3 = d1-d2;
        System.out.println(d3);

        int e1 = 763;
        double e2 = 4569.32;
        double e3 = e1*e2;
        System.out.println(e3);

        float f1 = 82.02f;
        double f2 = 34000.32;
        double f3 = f1*f2;
        System.out.println(f3);

        byte j1 = 12;
        char j2 = 'A';
        int j3 = j1*j2;
        System.out.println(j3);

        byte h1 = 12;
        short h2 = 456;
        int h3 = h1+h2;
        System.out.println(h3);

        short g1 = 345;
        long g2 = 3489000l;
        long g3 = g1-g2;
        System.out.println(g3);

        char k1 = 'J';
        char k2 = 'K';
        int k3 = k1*k2;
        System.out.println(k3);


        byte l1 = 32;
        char l2 = 'R';
        int l3 = l1/l2;
        System.out.println(l3);

        short t1 = 78;
        Short t2 =41;
        int t3 = t1-t2;
        System.out.println(t3);


    }
    
}
