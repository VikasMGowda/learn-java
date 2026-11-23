public class IsPalindrome3ApproachLeet125
{
    // LeetCode 125: Valid Palindrome
    // Approach 1: best is using String and two pointers
    //class : String
    // Time Complexity: O(n)
    // Space Complexity: O(1)
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

        System.out.println("Input :" + input);
        System.out.println("Answer :" + answer);
    }
    public  static boolean isPalindrome(String input)
    {
        //two pointers starts here
        int left = 0;
        int right = input.length()-1;

        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(input.charAt(left)))
            {
                left++;
            }
            while(left < right  && !Character.isLetterOrDigit(input.charAt(right)))
            {
                right--;
            }

            if(Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right)))
            {
                return  false;
            }
            left ++;
            right--;
        }

        return true;

    }
}
