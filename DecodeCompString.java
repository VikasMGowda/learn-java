public class DecodeCompString
{

    // problem : Decode compare string
    // Approach 1: 
    //class : String
    // Time Complexity:O(n+k)
    // Space Complexity:O(k)
    public static void main(String[] args)
    {
        testDecode("a3b3c2");
        testDecode("x1y5");
        testDecode("m2n3");

    }

    public static void testDecode(String s)
    {
        System.out.println("Input :"+ s);
        System.out.println("Answer :"+ decode(s));
    }

    public static String decode(String s)
    {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<s.length(); i= i+2)
        {
            char currentCharacter = s.charAt(i);

            int number = s.charAt(i+1) -'0';

            for(int count = 1; count <= number; count++)
            {
                answer.append(currentCharacter);
            }
        }
        return answer.toString();
    }
}
