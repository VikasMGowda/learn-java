public class RegularMetaChars
{
    public static void main(String[] args) 
    {
        demoMatchOnedigit();
        demoMatchOneWord();
        demoMatchOneSpace();
        demoNondigit();
        demoMatchOneWord();
        demoNonSpace();
        demoStarQuant();
        demoPlusQuant();
        demoExactCount();
        demoMinMaxQuant();
        demoQstnMark();
    }


    //1) \d -- matches one digit

    public static void demoMatchOnedigit()
    {
        String a ="8";
        System.out.println(a.matches("\\d"));
        System.out.println("A".matches("\\d"));
    }

    //2) \w -- matches one word char
    public static void demoMatchOneWord()
    {
        String a = "A";
        System.out.println(a.matches("\\w"));
        System.out.println("A".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));

    }

    //3) \s -- matches one spaces
    public static void demoMatchOneSpace()
    {
        String s = " ";
        System.out.println(" ".matches("\\s"));
        System.out.println("_".matches("\\s"));
    }

    //1) \D -- non digit matching
    public static void demoNondigit()
    {
        String a ="8";
        System.out.println(a.matches("\\D"));
        System.out.println("A".matches("\\D"));
    }

    //2) \W -- non word matching
    public static void demoNonWord()
    {
        String a = "A";
        System.out.println(a.matches("\\W"));
        System.out.println("A".matches("\\W"));
        System.out.println("9".matches("\\W"));
        System.out.println("@".matches("\\W"));
        System.out.println("_".matches("\\w"));

    }

    //3) \S -- non space matching
    public static void demoNonSpace()
    {
        String s = " ";
        System.out.println(" ".matches("\\S"));
        System.out.println("_".matches("\\S"));
    }

    // 1) (*) -- checks for 0 or more
    public static void demoStarQuant()
    {
        String s1 = "abcbbaaac";
        String s2 = "";
        String s3 = "abc7";

        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
    }

    //2) plus(+) -- check for one or more
    public static void demoPlusQuant()
    {
        String s1 = "abc";
        String s2 = "";
        String s3 = "aaabbb";

        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
    }

     //3) Exact Count({n})
    public static void demoExactCount()
    {
        String s1 = "acc";
        String s2 = "";
        String s3 = "abcd";

        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abc]{3}"));

    }

    //4) {min, max} -- check within range
    public static void demoMinMaxQuant()
    {
        String s1 = "abccba";
        String s2 = "ab";
        String s3 = "abccbaaa";

        System.out.println(s1.matches("[abc]{3,7}"));
        System.out.println(s2.matches("[abc]{3,7}"));
        System.out.println(s3.matches("[abc]{3,7}"));

    }

     //5) Question mark  -- check for 0 or 1
    public static void demoQstnMark()
    {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abbc";

        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s3.matches("ab?c"));

    }
}
