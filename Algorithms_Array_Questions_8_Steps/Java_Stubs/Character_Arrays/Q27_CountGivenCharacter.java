import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 27 · Count a given character
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return how many times a given character appears.
 *
 *   Sample input to the function:    ['b','a','n','a','n','a'] and 'a'
 *   Sample return from the function: 3
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside countOccurrences(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q27_CountGivenCharacter.java  then  java Q27_CountGivenCharacter
 *      (or run it in one step with:  java Q27_CountGivenCharacter.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q27_CountGivenCharacter {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int countOccurrences(char[] letters, char target) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("countOccurrences is not written yet");
    }

    // ======================================================================
    //  Test cases for countOccurrences: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countOccurrences(new char[]{'b', 'a', 'n', 'a', 'n', 'a'}, 'a'),
                3);
        run(2, "Null input",
                () -> countOccurrences((char[]) null, 'a'),
                0);
        run(3, "Empty",
                () -> countOccurrences(new char[]{}, 'a'),
                0);
        run(4, "Single slip, a match",
                () -> countOccurrences(new char[]{'q'}, 'q'),
                1);
        run(5, "Target not present",
                () -> countOccurrences(new char[]{'c', 'a', 't'}, 'z'),
                0);
        run(6, "Target at first and last",
                () -> countOccurrences(new char[]{'a', 'b', 'a'}, 'a'),
                2);
        run(7, "Case-sensitive: capital not counted",
                () -> countOccurrences(new char[]{'A', 'p', 'a'}, 'a'),
                1);
        run(8, "Capital target",
                () -> countOccurrences(new char[]{'B', 'b', 'B'}, 'B'),
                2);
        run(9, "Target is a space",
                () -> countOccurrences(new char[]{'a', ' ', 'b', ' '}, ' '),
                2);
        run(10, "Target is a digit",
                () -> countOccurrences(new char[]{'1', '0', '1', 'l'}, '1'),
                2);
        run(11, "Target is a symbol",
                () -> countOccurrences(new char[]{'@', 'a', '@', '#'}, '@'),
                2);
        run(12, "Every slip matches",
                () -> countOccurrences(new char[]{'z', 'z', 'z', 'z'}, 'z'),
                4);

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
