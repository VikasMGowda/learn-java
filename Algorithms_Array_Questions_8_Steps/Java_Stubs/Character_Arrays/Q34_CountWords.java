import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 34 · Count the words in a sentence
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the number of words. Words are separated by single spaces.
 *
 *   Sample input to the function:    ['I',' ','l','o','v','e',' ','J','a','v','a']
 *   Sample return from the function: 3
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside countWords(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q34_CountWords.java  then  java Q34_CountWords
 *      (or run it in one step with:  java Q34_CountWords.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q34_CountWords {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int countWords(char[] sentence) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("countWords is not written yet");
    }

    // ======================================================================
    //  Test cases for countWords: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countWords(new char[]{'I', ' ', 'l', 'o', 'v', 'e', ' ', 'J', 'a', 'v', 'a'}),
                3);
        run(2, "Null input",
                () -> countWords((char[]) null),
                0);
        run(3, "Empty",
                () -> countWords(new char[]{}),
                0);
        run(4, "Single letter",
                () -> countWords(new char[]{'I'}),
                1);
        run(5, "Single space",
                () -> countWords(new char[]{' '}),
                0);
        run(6, "One word, no spaces",
                () -> countWords(new char[]{'J', 'a', 'v', 'a'}),
                1);
        run(7, "Only spaces",
                () -> countWords(new char[]{' ', ' ', ' '}),
                0);
        run(8, "Space at the start",
                () -> countWords(new char[]{' ', 'h', 'i'}),
                1);
        run(9, "Space at the end",
                () -> countWords(new char[]{'h', 'i', ' '}),
                1);
        run(10, "Two spaces in a row",
                () -> countWords(new char[]{'a', ' ', ' ', 'b'}),
                2);
        run(11, "One-letter words",
                () -> countWords(new char[]{'a', ' ', 'b', ' ', 'c'}),
                3);
        run(12, "Digits and symbols",
                () -> countWords(new char[]{'4', '0', '%', ' ', 'o', 'f', 'f', ' ', '!'}),
                3);

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
