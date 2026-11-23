import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 28 · Turn every letter into a capital
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the array with every letter in capitals.
 *
 *   Sample input to the function:    ['c','o','d','e']
 *   Sample return from the function: ['C','O','D','E']
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside toUpperCase(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q28_ToUpperCase.java  then  java Q28_ToUpperCase
 *      (or run it in one step with:  java Q28_ToUpperCase.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q28_ToUpperCase {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static char[] toUpperCase(char[] letters) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("toUpperCase is not written yet");
    }

    // ======================================================================
    //  Test cases for toUpperCase: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> toUpperCase(new char[]{'c', 'o', 'd', 'e'}),
                new char[]{'C', 'O', 'D', 'E'});
        run(2, "Null input",
                () -> toUpperCase((char[]) null),
                new char[]{});
        run(3, "Empty",
                () -> toUpperCase(new char[]{}),
                new char[]{});
        run(4, "Single small letter",
                () -> toUpperCase(new char[]{'x'}),
                new char[]{'X'});
        run(5, "Already all capitals",
                () -> toUpperCase(new char[]{'J', 'A', 'V', 'A'}),
                new char[]{'J', 'A', 'V', 'A'});
        run(6, "Mixed case",
                () -> toUpperCase(new char[]{'j', 'A', 'v', 'A'}),
                new char[]{'J', 'A', 'V', 'A'});
        run(7, "Space in the middle",
                () -> toUpperCase(new char[]{'h', 'i', ' ', 'u'}),
                new char[]{'H', 'I', ' ', 'U'});
        run(8, "Digits and symbols",
                () -> toUpperCase(new char[]{'a', '1', '@', 'b'}),
                new char[]{'A', '1', '@', 'B'});
        run(9, "Ends of the alphabet",
                () -> toUpperCase(new char[]{'a', 'z'}),
                new char[]{'A', 'Z'});
        run(10, "Neighbours of 'a' and 'z'",
                () -> toUpperCase(new char[]{'`', '{'}),
                new char[]{'`', '{'});
        run(11, "No letters at all",
                () -> toUpperCase(new char[]{'4', '2', ' ', '!'}),
                new char[]{'4', '2', ' ', '!'});

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
