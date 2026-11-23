import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 35 · Initials of a full name, in capitals
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given a full name, return the initials in capitals.
 *
 *   Sample input to the function:    ['r','a','h','u','l',' ','d','r','a','v','i','d']
 *   Sample return from the function: ['R','D']
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside getInitials(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q35_NameInitials.java  then  java Q35_NameInitials
 *      (or run it in one step with:  java Q35_NameInitials.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q35_NameInitials {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static char[] getInitials(char[] name) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("getInitials is not written yet");
    }

    // ======================================================================
    //  Test cases for getInitials: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> getInitials(new char[]{'r', 'a', 'h', 'u', 'l', ' ', 'd', 'r', 'a', 'v', 'i', 'd'}),
                new char[]{'R', 'D'});
        run(2, "Null input",
                () -> getInitials((char[]) null),
                new char[]{});
        run(3, "Empty",
                () -> getInitials(new char[]{}),
                new char[]{});
        run(4, "Single letter",
                () -> getInitials(new char[]{'k'}),
                new char[]{'K'});
        run(5, "One name only",
                () -> getInitials(new char[]{'s', 'a', 'c', 'h', 'i', 'n'}),
                new char[]{'S'});
        run(6, "Three words",
                () -> getInitials(new char[]{'s', 'a', 'i', ' ', 'r', 'a', 'm', ' ', 'k', 'u', 'm', 'a', 'r'}),
                new char[]{'S', 'R', 'K'});
        run(7, "Capital inside a word",
                () -> getInitials(new char[]{'M', 'S', ' ', 'D', 'h', 'o', 'n', 'i'}),
                new char[]{'M', 'D'});
        run(8, "Mixed case",
                () -> getInitials(new char[]{'v', 'I', 'R', 'A', 'T', ' ', 'k', 'o', 'h', 'l', 'i'}),
                new char[]{'V', 'K'});
        run(9, "Extra spaces start, middle, end",
                () -> getInitials(new char[]{' ', 'a', 'n', 'i', 'l', ' ', ' ', 'k', 'u', 'm', 'b', 'l', 'e', ' '}),
                new char[]{'A', 'K'});
        run(10, "One-letter words",
                () -> getInitials(new char[]{'m', ' ', 's', ' ', 'd'}),
                new char[]{'M', 'S', 'D'});
        run(11, "Only spaces",
                () -> getInitials(new char[]{' ', ' '}),
                new char[]{});
        run(12, "Dots inside a word",
                () -> getInitials(new char[]{'a', '.', 'p', '.', 'j', ' ', 'k', 'a', 'l', 'a', 'm'}),
                new char[]{'A', 'K'});

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
