public class IsPalindromeLeet125
{
    // LeetCode 125: Valid Palindrome
    // Approach 1: Reverse String
    //class : String
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static void main(String[] args)
    {
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome(" A man, a plan, a canal: Panama");
        testPalindrome("race a car");
        testPalindrome("12321");
        testPalindrome("A1@b#b@1a");
    }

    public static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Answer: " + answer);
        System.out.println();
    }

    public static boolean isPalindrome(String input)
    {
        // Step 1: Convert to lowercase
        input = input.toLowerCase();

        // Step 2: Keep only letters and digits
        String cleaned = "";

        for(int i = 0; i < input.length(); i++)
        {
            char currentCharacter = input.charAt(i);

            if(Character.isLetterOrDigit(currentCharacter))
            {
                cleaned = cleaned + currentCharacter;
            }
        }

        // Step 3: Reverse the string
        StringBuilder builder = new StringBuilder(cleaned);

        String reverse = builder.reverse().toString();

        // Step 4: Compare both strings
        return cleaned.equals(reverse);
    }
}
