import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 44 · Is the word a palindrome?
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return true if the word reads the same forwards and backwards.
 *
 *   Sample input to the function:    ['m','a','d','a','m']
 *   Sample return from the function: true
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside isPalindromeWord(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q44_IsPalindromeWord.java  then  java Q44_IsPalindromeWord
 *      (or run it in one step with:  java Q44_IsPalindromeWord.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q44_IsPalindromeWord {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static boolean isPalindromeWord(char[] word) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("isPalindromeWord is not written yet");
    }

    // ======================================================================
    //  Test cases for isPalindromeWord: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> isPalindromeWord(new char[]{'m', 'a', 'd', 'a', 'm'}),
                true);
        run(2, "Null input",
                () -> isPalindromeWord((char[]) null),
                false);
        run(3, "Empty",
                () -> isPalindromeWord(new char[]{}),
                true);
        run(4, "Single character",
                () -> isPalindromeWord(new char[]{'x'}),
                true);
        run(5, "Two different characters",
                () -> isPalindromeWord(new char[]{'o', 'n'}),
                false);
        run(6, "Even length (no middle)",
                () -> isPalindromeWord(new char[]{'n', 'o', 'o', 'n'}),
                true);
        run(7, "Ends match, inside does not",
                () -> isPalindromeWord(new char[]{'a', 'b', 'c', 'a'}),
                false);
        run(8, "Ends differ, inside mirrors",
                () -> isPalindromeWord(new char[]{'n', 'o', 'o', 'm'}),
                false);
        run(9, "Upper and lower case",
                () -> isPalindromeWord(new char[]{'M', 'a', 'd', 'a', 'm'}),
                true);
        run(10, "Digits and symbols",
                () -> isPalindromeWord(new char[]{'1', '2', '#', '2', '1'}),
                true);
        run(11, "Space counts as a character",
                () -> isPalindromeWord(new char[]{'t', 'o', 'p', ' ', 's', 'p', 'o', 't'}),
                false);
        run(12, "Longer palindrome",
                () -> isPalindromeWord(new char[]{'r', 'a', 'c', 'e', 'c', 'a', 'r'}),
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
