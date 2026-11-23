public class IsPalindrome2ApproachLeet125
{
     // LeetCode 125: Valid Palindrome
    // Approach 1: Reverse String
    //class : StringBuilder
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
        // Step 1: Create StringBuilder
        StringBuilder cleaned = new StringBuilder();

        // Step 2: Convert to lowercase and remove unwanted characters
        for(int i = 0; i < input.length(); i++)
        {
            char ch = Character.toLowerCase(input.charAt(i));

            if(Character.isLetterOrDigit(ch))
            {
                cleaned.append(ch);
            }
        }

        // Step 3: Reverse using StringBuilder
        StringBuilder reverse = new StringBuilder(cleaned);
        reverse.reverse();

        // Step 4: Compare original and reversed strings
        return cleaned.toString().equals(reverse.toString());
    }
}
