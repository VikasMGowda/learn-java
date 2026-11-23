public class CountCharArr
{
    static void countCharElement(char[] ch)
{
    int count = 0;

    for(int i = 0; i < ch.length; i++)
    {
        if(!((ch[i] >= 'A' && ch[i] <= 'Z') ||
            (ch[i] >= 'a' && ch[i] <= 'z') ||
            (ch[i] >= '0' && ch[i] <= '9')))
        {
            count++;
        }
    }

    System.out.println("Special character count: " + count);
}

    static void replaceVowelsWithStar(char[]ch2)
    {
        for(int i =0; i< ch2.length;i++)
        {
            if((ch2[i]== 'A'||ch2[i] == 'a')||
            (ch2[i]== 'E'||ch2[i] == 'e') ||
            (ch2[i]== 'I'||ch2[i] == 'i') ||
            (ch2[i]== 'O'||ch2[i] == 'o') ||
            (ch2[i]== 'U'||ch2[i] == 'u'))
            {
                ch2[i]= '*';
            }
        System.out.println(ch2[i]);
    }
}

    static void stringCountElement(String str)
    {
        int strcount =0;
        for(int i =0; i<str.length(); i++)
        {
            char ch1 = str.charAt(i);
            if(!(ch1>='A'&& ch1<='Z')||
            (ch1>='a'&& ch1<='z')||
            (ch1>='0' && ch1<='9'))
            {
                strcount++;
            }
        
        }
        System.out.println(strcount);
    }
    public static void main(String[] args)
    {
        char[] ch= {'a','#','B','@','c','D','$'};
        String []str ={"vik@9sMG"};
        char [] ch2 ={'a','B','E','I','1','p','R'};

        countCharElement(ch);
        //stringCountElement(str);
        replaceVowelsWithStar(ch2);
        
    }
}
