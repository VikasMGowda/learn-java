import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 31 · Count capital letters
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return how many capital letters are in the array.
 *
 *   Sample input to the function:    ['I','n','d','i','a','N','o','1']
 *   Sample return from the function: 2
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q31_CountCapitalLetters {

    public static int countCapitalLetters(char[] letters) {
        // Early exit: no characters means no capital letters
        if (letters == null || letters.length == 0) {
            return 0;
        }

        int capitalCount = 0;

        for (int index = 0; index < letters.length; index++) {
            char current = letters[index];

            // Both ends included: 'A' and 'Z' are capitals too
            if (current >= 'A' && current <= 'Z') {
                capitalCount++;
            }
        }

        return capitalCount;
    }

    // ======================================================================
    //  Test cases for countCapitalLetters: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countCapitalLetters(new char[]{'I', 'n', 'd', 'i', 'a', 'N', 'o', '1'}),
                2);
        run(2, "Null input",
                () -> countCapitalLetters((char[]) null),
                0);
        run(3, "Empty",
                () -> countCapitalLetters(new char[]{}),
                0);
        run(4, "Single capital",
                () -> countCapitalLetters(new char[]{'Q'}),
                1);
        run(5, "No capitals",
                () -> countCapitalLetters(new char[]{'j', 'a', 'v', 'a'}),
                0);
        run(6, "All capitals, with repeats",
                () -> countCapitalLetters(new char[]{'B', 'H', 'A', 'R', 'A', 'T'}),
                6);
        run(7, "Ends of the range 'A' and 'Z'",
                () -> countCapitalLetters(new char[]{'A', 'b', 'Z'}),
                2);
        run(8, "Neighbours of 'A' and 'Z'",
                () -> countCapitalLetters(new char[]{'@', '[', 'm'}),
                0);
        run(9, "Small 'a' and 'z' do not count",
                () -> countCapitalLetters(new char[]{'a', 'z', 'M'}),
                1);
        run(10, "Digits, space and symbols",
                () -> countCapitalLetters(new char[]{'1', ' ', '#', '!'}),
                0);
        run(11, "Capital after a space",
                () -> countCapitalLetters(new char[]{'N', 'e', 'w', ' ', 'D', 'e', 'l', 'h', 'i'}),
                2);

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
