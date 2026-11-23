
public class Charpractice
{
    public static void demo1(char[] name)
    {
        char[] temp= new char[5];

        for(int i = 0; i < temp.length; i++)
        {
            System.out.print((int) temp[i] + " ");
        }

        System.out.println();
    }

    public static void demo2(char[] name)
    {
        char[] temp1 = new char[name.length];

        for(int i = 0; i < name.length; i++)
        {
            temp1[i] = name[i];
            System.out.print(temp1[i] + " ");
        }

        System.out.println();
    }

    public static void demo3(char[] name)
    {
        char[] temp3 ={'H','E','L','L','O','S','T','R','I','N','G'};
        for(int i =0 ;i<temp3.length; i++)
        {
            System.out.print(temp3[i]+" ");
        }
        System.out.println("\n length "+ temp3.length);
    }

    public static void demo4()
    {
        char ch = 'A';
        System.out.println((char)(ch+1));

    }

    public static void demo5()
    {
        char ch = 'A';
        System.out.println((char)(ch-1));
    }

    //CAPS to small

    public static void demo6()
    {
        char ch = 'a';
        System.out.println((char)(ch+33));
    }

    public static void demo7()
    {
        char[] temp = {'J','A','V','A'};
        for(int i =0; i<temp.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("index"+ i +":"+temp);
            }
        }
    }

    public static void demo8()
    {
        String name = "Java";
        for(int i =0; i<name.length(); i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("index" + i + ":"+ name.charAt(i));
            }
        }
    }

    public static void demo9()
    {
    char[] temp = {'v','i','k','a','S'};
        
        if(temp.length % 2 == 1)
        {
            System.out.println("Middle :"+ temp[temp.length/2]);
        }
        else
        {
            System.out.println("Middle : "+ temp [temp.length/2 -1]+" "+temp[temp.length/2]);
        }
        System.out.println();
    }

    public static void demo10()
    {
        String str = "  Hello Java   ";

        String result = str.trim();

        System.out.println("output :" + result);

    }


    public static void demo11()
    {
        String str = "  Hello Java  can i Learn ";

        String [] result1 = str.split(" ");

        for(int i =0; i<result1.length; i++)
        {

        System.out.println(result1[i]);

    }
}

public static void demo12()
{
    String sentence = "Programming";
    System.out.println(sentence.substring(0, 4));

    System.out.println();

    
}

public static void demo13()
{
    String sentence = "Programming";
    System.out.println(sentence.substring(4));

    System.out.println();

    
}

public static void demo14()
{
    String  str = "www.google.com";
    System.out.println(str.indexOf("."));
}


public static void demo15()
{
    String str = "www.google.com";

    System.out.println(str.lastIndexOf(".",4));
}
    public static void main(String[] args)
    {
        char[] name = {'V', 'I', 'K', 'A', 'S'};

        demo1(name);
        demo2(name);
        demo3(name);
        demo4();
        demo5();
        demo6();
        demo7();
        demo8();
        demo9();
        demo10();
        demo11();
        demo12();
        demo13();
        demo14();
        demo15();
    }
}
