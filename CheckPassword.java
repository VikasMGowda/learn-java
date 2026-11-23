public class CheckPassword
{
    public static boolean isPasswordValid(char[] arr)
    {
        if (arr == null || arr.length < 8)
        {
            System.out.println("Password must contain at least 8 characters");
            return false;
        }

        boolean isLower = false;
        boolean isUpper = false;
        boolean isDigit = false;
        boolean isSpecialch = false;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 'a' && arr[i] <= 'z')
            {
                isLower = true;
            }
            else if (arr[i] >= 'A' && arr[i] <= 'Z')
            {
                isUpper = true;
            }
            else if (arr[i] >= '0' && arr[i] <= '9')
            {
                isDigit = true;
            }
            else if (arr[i] == '@' || arr[i] == '$'|| arr[i] == '*' || arr[i] == '#')
            {
                isSpecialch = true;
            }
        }

        if (!isLower)
        {
            System.out.println("At least one lowercase letter is required");
        }

        if (!isUpper)
        {
            System.out.println("At least one uppercase letter is required");
        }

        if (!isDigit)
        {
            System.out.println("At least one digit is required");
        }

        if (!isSpecialch)
        {
            System.out.println("At least one special character is required");
        }

        return isLower && isUpper && isDigit && isSpecialch;
    }

    public static void main(String[] args)
    {
        char[] arr = {'a', 'A', '@', 'j', 'J', '*', 'a', 'L','1'};

        System.out.println(isPasswordValid(arr));
    }
}
