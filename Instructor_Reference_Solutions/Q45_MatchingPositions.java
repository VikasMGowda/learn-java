import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 45 · Count positions where two words match
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given two words of the same length, return at how many positions they have the same
 *   character.
 *
 *   Sample input to the function:    ['c','a','r','d'] and ['c','o','r','e']
 *   Sample return from the function: 2
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q45_MatchingPositions {

    public static int countMatchingPositions(char[] firstWord, char[] secondWord) {
        // Early exit: a missing word has no positions to compare
        if (firstWord == null || secondWord == null) {
            return 0;
        }

        int matchCount = 0;

        // Lengths should be equal; stopping at the shorter one never reads past an end
        int length = Math.min(firstWord.length, secondWord.length);

        for (int index = 0; index < length; index++) {
            // Exact comparison: 'C' and 'c' are different characters
            if (firstWord[index] == secondWord[index]) {
                matchCount++;
            }
        }

        return matchCount;
    }

    // ======================================================================
    //  Test cases for countMatchingPositions: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countMatchingPositions(new char[]{'c', 'a', 'r', 'd'}, new char[]{'c', 'o', 'r', 'e'}),
                2);
        run(2, "First word null",
                () -> countMatchingPositions((char[]) null, new char[]{'a', 'b'}),
                0);
        run(3, "Second word null",
                () -> countMatchingPositions(new char[]{'a', 'b'}, (char[]) null),
                0);
        run(4, "Both empty",
                () -> countMatchingPositions(new char[]{}, new char[]{}),
                0);
        run(5, "Single character, same",
                () -> countMatchingPositions(new char[]{'x'}, new char[]{'x'}),
                1);
        run(6, "All positions match",
                () -> countMatchingPositions(new char[]{'j', 'a', 'v', 'a'}, new char[]{'j', 'a', 'v', 'a'}),
                4);
        run(7, "No position matches",
                () -> countMatchingPositions(new char[]{'a', 'b', 'c'}, new char[]{'x', 'y', 'z'}),
                0);
        run(8, "Same letters, other order",
                () -> countMatchingPositions(new char[]{'l', 'i', 's', 't'}, new char[]{'s', 'i', 'l', 't'}),
                2);
        run(9, "Upper and lower case",
                () -> countMatchingPositions(new char[]{'C', 'a', 't'}, new char[]{'c', 'a', 't'}),
                2);
        run(10, "Space, digit and symbol",
                () -> countMatchingPositions(new char[]{'1', ' ', '#'}, new char[]{'1', ' ', '@'}),
                2);
        run(11, "Duplicates in a word",
                () -> countMatchingPositions(new char[]{'a', 'a', 'a'}, new char[]{'a', 'b', 'a'}),
                2);
        run(12, "Lengths differ (broken promise)",
                () -> countMatchingPositions(new char[]{'a', 'b', 'c'}, new char[]{'a', 'b'}),
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
