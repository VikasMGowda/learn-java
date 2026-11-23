import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 42 · Move every letter one step forward
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the array with each letter moved one step forward in the alphabet ('z'
 *   becomes 'a').
 *
 *   Sample input to the function:    ['c','a','t','z']
 *   Sample return from the function: ['d','b','u','a']
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside shiftLettersForward(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q42_ShiftLettersForward.java  then  java Q42_ShiftLettersForward
 *      (or run it in one step with:  java Q42_ShiftLettersForward.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q42_ShiftLettersForward {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static char[] shiftLettersForward(char[] letters) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("shiftLettersForward is not written yet");
    }

    // ======================================================================
    //  Test cases for shiftLettersForward: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> shiftLettersForward(new char[]{'c', 'a', 't', 'z'}),
                new char[]{'d', 'b', 'u', 'a'});
        run(2, "Null input",
                () -> shiftLettersForward((char[]) null),
                new char[]{});
        run(3, "Empty",
                () -> shiftLettersForward(new char[]{}),
                new char[]{});
        run(4, "Single 'z' wraps",
                () -> shiftLettersForward(new char[]{'z'}),
                new char[]{'a'});
        run(5, "Capitals, 'Z' wraps to 'A'",
                () -> shiftLettersForward(new char[]{'A', 'B', 'Z'}),
                new char[]{'B', 'C', 'A'});
        run(6, "Mixed case keeps case",
                () -> shiftLettersForward(new char[]{'Z', 'z', 'Y', 'y'}),
                new char[]{'A', 'a', 'Z', 'z'});
        run(7, "'z' first, 'y' last (no early wrap)",
                () -> shiftLettersForward(new char[]{'z', 'o', 'o', 'y'}),
                new char[]{'a', 'p', 'p', 'z'});
        run(8, "Digits unchanged",
                () -> shiftLettersForward(new char[]{'a', '1', '9', '0'}),
                new char[]{'b', '1', '9', '0'});
        run(9, "Spaces and symbols unchanged",
                () -> shiftLettersForward(new char[]{'h', 'i', ' ', '!'}),
                new char[]{'i', 'j', ' ', '!'});
        run(10, "Boundary symbols next to letters",
                () -> shiftLettersForward(new char[]{'@', '[', '`', '{'}),
                new char[]{'@', '[', '`', '{'});
        run(11, "Repeated letters",
                () -> shiftLettersForward(new char[]{'a', 'a', 'a'}),
                new char[]{'b', 'b', 'b'});

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
