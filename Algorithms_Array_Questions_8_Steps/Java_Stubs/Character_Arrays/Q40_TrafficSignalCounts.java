import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 40 · Count red, green and yellow signals
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given the traffic signal colours seen in a day ('R', 'G', 'Y'), return the counts as
 *   [red, green, yellow].
 *
 *   Sample input to the function:    ['R','G','G','Y','R','G']
 *   Sample return from the function: [2, 3, 1]
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside countSignalColours(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q40_TrafficSignalCounts.java  then  java Q40_TrafficSignalCounts
 *      (or run it in one step with:  java Q40_TrafficSignalCounts.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q40_TrafficSignalCounts {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int[] countSignalColours(char[] signals) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("countSignalColours is not written yet");
    }

    // ======================================================================
    //  Test cases for countSignalColours: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countSignalColours(new char[]{'R', 'G', 'G', 'Y', 'R', 'G'}),
                new int[]{2, 3, 1});
        run(2, "Null input",
                () -> countSignalColours((char[]) null),
                new int[]{0, 0, 0});
        run(3, "Empty",
                () -> countSignalColours(new char[]{}),
                new int[]{0, 0, 0});
        run(4, "Single yellow (last slot)",
                () -> countSignalColours(new char[]{'Y'}),
                new int[]{0, 0, 1});
        run(5, "All red",
                () -> countSignalColours(new char[]{'R', 'R', 'R'}),
                new int[]{3, 0, 0});
        run(6, "Answer order is red, green, yellow",
                () -> countSignalColours(new char[]{'Y', 'Y', 'G'}),
                new int[]{0, 1, 2});
        run(7, "One of each, reverse order",
                () -> countSignalColours(new char[]{'Y', 'G', 'R'}),
                new int[]{1, 1, 1});
        run(8, "Lowercase is not a signal (case)",
                () -> countSignalColours(new char[]{'r', 'R', 'g', 'y'}),
                new int[]{1, 0, 0});
        run(9, "Unknown letter and space",
                () -> countSignalColours(new char[]{'R', 'X', ' ', 'G'}),
                new int[]{1, 1, 0});
        run(10, "Digits and symbols",
                () -> countSignalColours(new char[]{'1', 'G', '#', 'Y', '0'}),
                new int[]{0, 1, 1});
        run(11, "Long day with duplicates",
                () -> countSignalColours(new char[]{'R', 'R', 'R', 'G', 'Y', 'Y', 'Y', 'Y'}),
                new int[]{3, 1, 4});

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
