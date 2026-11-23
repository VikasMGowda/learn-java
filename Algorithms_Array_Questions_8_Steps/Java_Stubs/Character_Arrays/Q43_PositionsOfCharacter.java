import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 43 · Find every position of a character
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the positions (indexes) where a given character appears.
 *
 *   Sample input to the function:    ['h','e','l','l','o'] and 'l'
 *   Sample return from the function: [2, 3]
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside findPositions(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q43_PositionsOfCharacter.java  then  java Q43_PositionsOfCharacter
 *      (or run it in one step with:  java Q43_PositionsOfCharacter.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q43_PositionsOfCharacter {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int[] findPositions(char[] letters, char target) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("findPositions is not written yet");
    }

    // ======================================================================
    //  Test cases for findPositions: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findPositions(new char[]{'h', 'e', 'l', 'l', 'o'}, 'l'),
                new int[]{2, 3});
        run(2, "Null input",
                () -> findPositions((char[]) null, 'a'),
                new int[]{});
        run(3, "Empty",
                () -> findPositions(new char[]{}, 'a'),
                new int[]{});
        run(4, "Not found",
                () -> findPositions(new char[]{'a', 'b', 'c'}, 'z'),
                new int[]{});
        run(5, "Only match at index 0",
                () -> findPositions(new char[]{'x', 'y'}, 'x'),
                new int[]{0});
        run(6, "Only match at the last index",
                () -> findPositions(new char[]{'a', 'b', 'c'}, 'c'),
                new int[]{2});
        run(7, "Every slip matches",
                () -> findPositions(new char[]{'a', 'a', 'a'}, 'a'),
                new int[]{0, 1, 2});
        run(8, "Case: lowercase target",
                () -> findPositions(new char[]{'L', 'l', 'L'}, 'l'),
                new int[]{1});
        run(9, "Case: capital target",
                () -> findPositions(new char[]{'L', 'l', 'L'}, 'L'),
                new int[]{0, 2});
        run(10, "Space as the target",
                () -> findPositions(new char[]{'a', ' ', 'b', ' '}, ' '),
                new int[]{1, 3});
        run(11, "Digit as the target",
                () -> findPositions(new char[]{'1', '2', '1', '0'}, '1'),
                new int[]{0, 2});
        run(12, "Symbol as the target",
                () -> findPositions(new char[]{'@', 'a', '@', 'b'}, '@'),
                new int[]{0, 2});

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
