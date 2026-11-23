public class LearnStrings
{
    public static void main(String[] args)
    {
        String name  = "algorithms 365 technologies";
        
        char ch = name.charAt(8);
        System.out.println(ch);

        char[] namearr =name.toCharArray();
        System.out.println(namearr);
        
        String subStr = name.substring(1);
        System.out.println(subStr);

        String replaceString = name.replace('o', '$');
        System.out.println(replaceString);

        int retvalue = name.compareToIgnoreCase("algorithms 365 technologies");
        System.out.println(retvalue);

    
    }
}
