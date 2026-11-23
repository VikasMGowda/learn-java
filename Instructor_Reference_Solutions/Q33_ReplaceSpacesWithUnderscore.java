import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 33 · Replace every space with an underscore
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the array with every space replaced by an underscore '_'.
 *
 *   Sample input to the function:    ['h','i',' ','t','h','e','r','e']
 *   Sample return from the function: ['h','i','_','t','h','e','r','e']
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q33_ReplaceSpacesWithUnderscore {

    public static char[] replaceSpaces(char[] sentence) {
        // Early exit: nothing to copy gives an empty answer
        if (sentence == null || sentence.length == 0) {
            return new char[0];
        }

        // A new array, so the caller's sentence is never changed
        char[] result = new char[sentence.length];

        for (int index = 0; index < sentence.length; index++) {
            char current = sentence[index];

            if (current == ' ') {
                result[index] = '_';
            } else {
                result[index] = current;
            }
        }

        return result;
    }

    // ======================================================================
    //  Test cases for replaceSpaces: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> replaceSpaces(new char[]{'h', 'i', ' ', 't', 'h', 'e', 'r', 'e'}),
                new char[]{'h', 'i', '_', 't', 'h', 'e', 'r', 'e'});
        run(2, "Null input",
                () -> replaceSpaces((char[]) null),
                new char[]{});
        run(3, "Empty",
                () -> replaceSpaces(new char[]{}),
                new char[]{});
        run(4, "Single space",
                () -> replaceSpaces(new char[]{' '}),
                new char[]{'_'});
        run(5, "Single letter",
                () -> replaceSpaces(new char[]{'a'}),
                new char[]{'a'});
        run(6, "No spaces",
                () -> replaceSpaces(new char[]{'j', 'a', 'v', 'a'}),
                new char[]{'j', 'a', 'v', 'a'});
        run(7, "Only spaces",
                () -> replaceSpaces(new char[]{' ', ' ', ' '}),
                new char[]{'_', '_', '_'});
        run(8, "Space first and last",
                () -> replaceSpaces(new char[]{' ', 'h', 'i', ' '}),
                new char[]{'_', 'h', 'i', '_'});
        run(9, "Two spaces in a row",
                () -> replaceSpaces(new char[]{'a', ' ', ' ', 'b'}),
                new char[]{'a', '_', '_', 'b'});
        run(10, "Capitals and digits",
                () -> replaceSpaces(new char[]{'C', 'S', 'E', ' ', '2', '0', '2', '6'}),
                new char[]{'C', 'S', 'E', '_', '2', '0', '2', '6'});
        run(11, "Symbols already there",
                () -> replaceSpaces(new char[]{'m', 'y', '_', 'f', 'i', 'l', 'e', '-', '1'}),
                new char[]{'m', 'y', '_', 'f', 'i', 'l', 'e', '-', '1'});
        run(12, "Tab is not a space",
                () -> replaceSpaces(new char[]{'a', '\t', 'b'}),
                new char[]{'a', '\t', 'b'});

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
