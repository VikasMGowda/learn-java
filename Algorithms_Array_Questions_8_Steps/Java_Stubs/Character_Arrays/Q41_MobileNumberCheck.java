import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 41 · Check a 10-digit mobile number
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Mobile number check: return true if there are exactly 10 characters and all are
 *   digits.
 *
 *   Sample input to the function:    ['9','8','4','5','0','1','2','3','4','5']
 *   Sample return from the function: true
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside isValidMobileNumber(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q41_MobileNumberCheck.java  then  java Q41_MobileNumberCheck
 *      (or run it in one step with:  java Q41_MobileNumberCheck.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q41_MobileNumberCheck {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static boolean isValidMobileNumber(char[] mobileNumber) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("isValidMobileNumber is not written yet");
    }

    // ======================================================================
    //  Test cases for isValidMobileNumber: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> isValidMobileNumber(new char[]{'9', '8', '4', '5', '0', '1', '2', '3', '4', '5'}),
                true);
        run(2, "Null input",
                () -> isValidMobileNumber((char[]) null),
                false);
        run(3, "Empty",
                () -> isValidMobileNumber(new char[]{}),
                false);
        run(4, "Only 9 digits",
                () -> isValidMobileNumber(new char[]{'9', '8', '4', '5', '0', '1', '2', '3', '4'}),
                false);
        run(5, "11 digits",
                () -> isValidMobileNumber(new char[]{'9', '8', '4', '5', '0', '1', '2', '3', '4', '5', '6'}),
                false);
        run(6, "Letter O instead of zero, last position",
                () -> isValidMobileNumber(new char[]{'9', '8', '4', '5', '0', '1', '2', '3', '4', 'O'}),
                false);
        run(7, "Lowercase letter, first position",
                () -> isValidMobileNumber(new char[]{'a', '8', '4', '5', '0', '1', '2', '3', '4', '5'}),
                false);
        run(8, "Space in the middle (10 chars)",
                () -> isValidMobileNumber(new char[]{'9', '8', '4', '5', ' ', '0', '1', '2', '3', '4'}),
                false);
        run(9, "Symbol: country code '+'",
                () -> isValidMobileNumber(new char[]{'+', '9', '1', '9', '8', '4', '5', '0', '1', '2'}),
                false);
        run(10, "Boundary: ':' just after '9'",
                () -> isValidMobileNumber(new char[]{'9', '8', '4', '5', '0', '1', '2', '3', ':', '5'}),
                false);
        run(11, "Boundary digits: all '0' and '9'",
                () -> isValidMobileNumber(new char[]{'0', '9', '0', '9', '0', '9', '0', '9', '0', '9'}),
                true);

        printSummary();
    }

    // ======================================================================
    //  Test harness: you do not need to change anything below this line.
    // ======================================================================

    private static int passed = 0;
    private static int total = 0;

    private static void run(int number, String category, Supplier<Object> call, Object expected) {
        total++;
        String label = "Test " + number + " (" + category + ")";
        try {
            Object returned = call.get();
            if (matches(expected, returned)) {
                passed++;
                System.out.println("PASS   " + label);
            } else {
                System.out.println("FAIL   " + label);
                System.out.println("         expected: " + show(expected));
                System.out.println("         returned: " + show(returned));
            }
        } catch (UnsupportedOperationException notWritten) {
            System.out.println("TODO   " + label + "  ->  write your code in the function first");
        } catch (Throwable error) {
            System.out.println("ERROR  " + label + "  ->  " + error);
        }
    }

    private static boolean matches(Object expected, Object returned) {
        if (expected instanceof Number && returned instanceof Number
                && !(expected instanceof Character) && !(returned instanceof Character)) {
            return Math.abs(((Number) expected).doubleValue() - ((Number) returned).doubleValue()) < 1e-6;
        }
        if (expected instanceof double[] && returned instanceof double[]) {
            double[] want = (double[]) expected;
            double[] got = (double[]) returned;
            if (want.length != got.length) {
                return false;
            }
            for (int index = 0; index < want.length; index++) {
                if (Math.abs(want[index] - got[index]) >= 1e-6) {
                    return false;
                }
            }
            return true;
        }
        return Objects.deepEquals(expected, returned);
    }

    private static String show(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof int[]) {
            return Arrays.toString((int[]) value);
        }
        if (value instanceof double[]) {
            return Arrays.toString((double[]) value);
        }
        if (value instanceof boolean[]) {
            return Arrays.toString((boolean[]) value);
        }
        if (value instanceof char[]) {
            StringBuilder text = new StringBuilder("[");
            char[] letters = (char[]) value;
            for (int index = 0; index < letters.length; index++) {
                text.append(index == 0 ? "" : ", ").append('\'').append(letters[index]).append('\'');
            }
            return text.append("]").toString();
        }
        if (value instanceof Object[]) {
            return Arrays.deepToString((Object[]) value);
        }
        if (value instanceof Character) {
            return "'" + value + "'";
        }
        return String.valueOf(value);
    }

    private static void printSummary() {
        System.out.println();
        System.out.println(passed + " / " + total + " test cases passed.");
        if (passed == total) {
            System.out.println("All test cases passed. Well done!");
        } else {
            System.out.println("Keep going: fix the failing cases, then run again.");
        }
    }
}
