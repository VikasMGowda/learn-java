public class Hamza
{
    static void printChar(char[] str)
    {
        for(int i = 0; i < str.length; i++)
        {

         //   System.out.println(str[i]);
        }
    }

    static void repalceByVowels(char[]ch)
    {
        for(int i = 0; i< ch.length; i++)
        {
            if(ch[i] == 'a' || ch[i] =='e'|| ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
                || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
            {
                ch[i] = '*';
            }
        }
        System.out.println(ch);
    }

    static void encryptionMsg(char[] ch) 
    {
        for(int i = 0; i < ch.length ; i++)
        {
            
            ch[i]--;
        }
        System.out.println(ch);
    }

    static void decryptionMsg(char[] ch)
    {
        for(int i = 0; i <ch.length; i++)
        {
            ch[i]++;
        }
        System.out.println(ch);
    }

    static void encryptionMsg1(char[] ch) 
    {
        char value = 10;
        for(int i = 0; i < ch.length ; i++)
        {
            
            value = (char) (ch.length + 1);
            ch[i]--;
        }
        System.out.println(ch);
    }

    static void decryptionMsg2(char[] ch)
    {
        char value = 10;
        for(int i = 0; i <ch.length; i++)
        {
            value = (char) (ch.length-1);
            ch[i]++;
        }
        System.out.println(ch);
    }

    public static void main(String[] args)
    {
        String msg = "hi Hamza, How are You?";
        char[] ch = msg.toCharArray();
        printChar(ch);
        
        System.out.println("Replace By * value :");
        repalceByVowels(ch);
        System.out.println("Encryption the message :");
        encryptionMsg(ch);
        System.out.println("Decryption the message :");
        decryptionMsg(ch);
        encryptionMsg1(ch);
        decryptionMsg2(ch);
        
    }
}
