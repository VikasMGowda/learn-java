import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 39 · Add up the digit characters
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the sum of all the digit characters, ignoring letters.
 *
 *   Sample input to the function:    ['a','3','b','7','2']
 *   Sample return from the function: 12
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q39_SumOfDigitCharacters {

    public static int sumDigits(char[] characters) {
        // Early exit: no characters means nothing to add
        if (characters == null || characters.length == 0) {
            return 0;
        }

        int digitSum = 0;

        for (int index = 0; index < characters.length; index++) {
            char current = characters[index];

            // Only '0' to '9' count; letters, spaces and symbols are ignored
            if (current >= '0' && current <= '9') {
                // '7' is stored as code 55; minus the code of '0' (48) gives 7
                digitSum += current - '0';
            }
        }

        return digitSum;
    }

    // ======================================================================
    //  Test cases for sumDigits: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> sumDigits(new char[]{'a', '3', 'b', '7', '2'}),
                12);
        run(2, "Null input",
                () -> sumDigits((char[]) null),
                0);
        run(3, "Empty",
                () -> sumDigits(new char[]{}),
                0);
        run(4, "Single digit",
                () -> sumDigits(new char[]{'7'}),
                7);
        run(5, "No digits, upper and lower case",
                () -> sumDigits(new char[]{'a', 'B', 'c', 'D'}),
                0);
        run(6, "Only digits",
                () -> sumDigits(new char[]{'9', '9', '9'}),
                27);
        run(7, "Neighbouring digits are separate",
                () -> sumDigits(new char[]{'1', '2', 'x'}),
                3);
        run(8, "Spaces and symbols",
                () -> sumDigits(new char[]{'1', ' ', '#', '2', '-', '3'}),
                6);
        run(9, "Digit zero adds nothing",
                () -> sumDigits(new char[]{'0', '0', 'a'}),
                0);
        run(10, "Boundary: '/' and ':' around the digits",
                () -> sumDigits(new char[]{'/', '0', ':', '9'}),
                9);
        run(11, "Digits first and last",
                () -> sumDigits(new char[]{'8', 'x', 'Y', '1'}),
                9);

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
