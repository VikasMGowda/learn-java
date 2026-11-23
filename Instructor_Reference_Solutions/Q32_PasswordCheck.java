import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 32 · Check a password: length and a digit
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Password check: return true if the password has at least 8 characters and at least
 *   one digit.
 *
 *   Sample input to the function:    ['s','e','c','r','e','t','9','x']
 *   Sample return from the function: true
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q32_PasswordCheck {

    public static boolean isValidPassword(char[] password) {
        // Early exit: no password at all cannot pass
        if (password == null) {
            return false;
        }

        final int MIN_LENGTH = 8;
        boolean longEnough = password.length >= MIN_LENGTH;
        boolean hasDigit = false;

        for (int index = 0; index < password.length; index++) {
            char current = password[index];

            // Compare with the characters '0' and '9', not the numbers 0 and 9
            if (current >= '0' && current <= '9') {
                hasDigit = true;
            }
        }

        return longEnough && hasDigit;
    }

    // ======================================================================
    //  Test cases for isValidPassword: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> isValidPassword(new char[]{'s', 'e', 'c', 'r', 'e', 't', '9', 'x'}),
                true);
        run(2, "Null input",
                () -> isValidPassword((char[]) null),
                false);
        run(3, "Empty",
                () -> isValidPassword(new char[]{}),
                false);
        run(4, "Single digit only",
                () -> isValidPassword(new char[]{'7'}),
                false);
        run(5, "Exactly 8, no digit",
                () -> isValidPassword(new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'}),
                false);
        run(6, "7 characters with a digit",
                () -> isValidPassword(new char[]{'a', 'b', 'c', 'd', 'e', 'f', '1'}),
                false);
        run(7, "Exactly 8, all digits",
                () -> isValidPassword(new char[]{'1', '2', '3', '4', '5', '6', '7', '8'}),
                true);
        run(8, "Digit in first position",
                () -> isValidPassword(new char[]{'1', 'A', 'b', 'c', 'D', 'e', 'f', 'g'}),
                true);
        run(9, "Digit '0' in last position",
                () -> isValidPassword(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', '0'}),
                true);
        run(10, "Capitals and symbols, no digit",
                () -> isValidPassword(new char[]{'P', 'A', 'S', 'S', '@', '#', '!', 'x'}),
                false);
        run(11, "Symbols next to digits: '/' ':'",
                () -> isValidPassword(new char[]{'a', 'b', '/', ':', 'c', 'd', 'e', 'f'}),
                false);
        run(12, "Spaces count, digit present",
                () -> isValidPassword(new char[]{'m', 'y', ' ', 'p', 'i', 'n', ' ', '4', '2'}),
                true);
        run(13, "Look-alikes 'O' and 'l'",
                () -> isValidPassword(new char[]{'P', 'A', 'S', 'S', 'W', 'O', 'R', 'D', 'l'}),
                false);

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
