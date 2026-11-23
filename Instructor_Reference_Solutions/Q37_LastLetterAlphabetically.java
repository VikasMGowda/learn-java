import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 37 · The letter that comes last in the alphabet
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the letter that comes last in alphabetical order.
 *
 *   Sample input to the function:    ['d','o','g','s']
 *   Sample return from the function: 's'
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q37_LastLetterAlphabetically {

    public static Character findLastLetter(char[] word) {
        // Early exit: no characters means no letter to return
        if (word == null || word.length == 0) {
            return null;
        }

        // null means "no letter seen yet"
        Character lastLetter = null;

        for (int index = 0; index < word.length; index++) {
            char current = word[index];

            // Digits, spaces and symbols never take part
            if (isEnglishLetter(current)) {
                // Compare small forms so 'Z' beats 'a'; strict > keeps the first of a tie
                if (lastLetter == null
                        || Character.toLowerCase(current) > Character.toLowerCase(lastLetter)) {
                    lastLetter = current;
                }
            }
        }

        return lastLetter;
    }

    private static boolean isEnglishLetter(char symbol) {
        return (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z');
    }

    // ======================================================================
    //  Test cases for findLastLetter: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findLastLetter(new char[]{'d', 'o', 'g', 's'}),
                's');
        run(2, "Null input",
                () -> findLastLetter((char[]) null),
                null);
        run(3, "Empty",
                () -> findLastLetter(new char[]{}),
                null);
        run(4, "Single letter",
                () -> findLastLetter(new char[]{'q'}),
                'q');
        run(5, "Answer in first position",
                () -> findLastLetter(new char[]{'z', 'e', 'b', 'r', 'a'}),
                'z');
        run(6, "Answer in last position",
                () -> findLastLetter(new char[]{'a', 'b', 'c', 'y'}),
                'y');
        run(7, "Capital comes last",
                () -> findLastLetter(new char[]{'Z', 'e', 'b', 'r', 'a'}),
                'Z');
        run(8, "Tie: 'P' and 'p'",
                () -> findLastLetter(new char[]{'a', 'P', 'p', 'l', 'e'}),
                'P');
        run(9, "Symbols above 'z' ignored",
                () -> findLastLetter(new char[]{'a', 'b', '9', '~', '{'}),
                'b');
        run(10, "Spaces ignored",
                () -> findLastLetter(new char[]{'c', 'a', 't', ' ', 'm', 'a', 't'}),
                't');
        run(11, "No letters at all",
                () -> findLastLetter(new char[]{'1', '2', '#', ' '}),
                null);
        run(12, "All the same letter",
                () -> findLastLetter(new char[]{'m', 'm', 'm'}),
                'm');

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
