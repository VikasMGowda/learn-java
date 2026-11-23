public class StringBuilderBufferMethods
{
    public static void main(String[] args)
    {
        demoAppend();
        demoInsert();
        demoDelete();
        demoReplace();
        demoReverse();
        demoCapacity();
        demoEnsureCapacity();
        demoSetCharAt();
        demoSetLength();
        demoSubStr();
        demoToString();
    }

    //1) append()
    public static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programming");
        System.out.println();
        System.out.println("Append-->"+sb);
    }
    

    //2) Insert()
    public static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Jva");
        sb.insert(1,"a");
        System.out.println();
        System.out.println("Insert-->"+sb);
        
    }

    //3) Delete()
    public static void demoDelete()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(4, 16);
        System.out.println();
        System.out.println("Delete-->"+sb);
    }

    //4) Replace()
    public static void demoReplace()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.replace(0, 4, "python");
        System.out.println();
        System.out.println("Replace-->"+sb);
    }

    //5) Reverse()
    public static void demoReverse()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println();
        System.out.println("Reverse-->"+sb);
    }

    //6) Capacity()
    public static void demoCapacity()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.capacity();
        System.out.println();
        System.out.println("Capacity-->"+sb);
    }

    //7) Ensure Capacity()
    public static void demoEnsureCapacity()
    {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(50);
        System.out.println("Ensure Capacity-->"+sb.capacity());
    }

    //8) SetCharAt()
    public static void demoSetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.setCharAt(0, 'M');
        System.out.println();
        System.out.println("setCharAt-->"+sb);
    }

    //9) Set Length()
    public static void demoSetLength()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.setLength(7);
        System.out.println();
        System.out.println("CharLength-->"+sb);
    }

    //10) subString
    public static void demoSubStr()
    {
        StringBuilder sb = new StringBuilder("Javaprogram");
        sb.substring(2, 6);
        System.out.println(sb);
    }

    //tostring()
    public static void demoToString()
    {
        StringBuilder sb = new StringBuilder("Nicetreat");
        sb.toString();
        System.out.println("toString-->"+sb);
    }

}
