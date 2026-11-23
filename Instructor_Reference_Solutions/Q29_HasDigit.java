import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 29 · Does the array have a digit?
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return true if the array contains at least one digit.
 *
 *   Sample input to the function:    ['p','a','s','s','1']
 *   Sample return from the function: true
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q29_HasDigit {

    public static boolean hasDigit(char[] password) {
        // Early exit: no characters means no digit
        if (password == null || password.length == 0) {
            return false;
        }

        boolean digitFound = false;

        // One digit settles the answer, so the walk stops as soon as it is found
        for (int index = 0; index < password.length && !digitFound; index++) {
            char current = password[index];

            // Compare with the characters '0'..'9', not the numbers 0..9
            if (current >= '0' && current <= '9') {
                digitFound = true;
            }
        }

        return digitFound;
    }

    // ======================================================================
    //  Test cases for hasDigit: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> hasDigit(new char[]{'p', 'a', 's', 's', '1'}),
                true);
        run(2, "Null input",
                () -> hasDigit((char[]) null),
                false);
        run(3, "Empty",
                () -> hasDigit(new char[]{}),
                false);
        run(4, "Only one slip, a digit",
                () -> hasDigit(new char[]{'0'}),
                true);
        run(5, "No digit at all",
                () -> hasDigit(new char[]{'p', 'a', 's', 's'}),
                false);
        run(6, "Digit in the first slip",
                () -> hasDigit(new char[]{'7', 'u', 'p'}),
                true);
        run(7, "Digit in the middle, space before",
                () -> hasDigit(new char[]{'r', 'o', 'o', 'm', ' ', '5', 'b'}),
                true);
        run(8, "Last digit '9'",
                () -> hasDigit(new char[]{'a', '9', 'b'}),
                true);
        run(9, "Neighbours of '0' and '9'",
                () -> hasDigit(new char[]{'/', ':', 'a'}),
                false);
        run(10, "Look-alike letters",
                () -> hasDigit(new char[]{'O', 'l', 'I', 'S'}),
                false);
        run(11, "Spaces and symbols only",
                () -> hasDigit(new char[]{'@', ' ', '#', '!'}),
                false);
        run(12, "All digits",
                () -> hasDigit(new char[]{'1', '2', '3'}),
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
