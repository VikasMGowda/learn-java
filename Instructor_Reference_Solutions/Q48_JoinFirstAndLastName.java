import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 48 · Join a first name and a last name
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given a first name and a last name, return the full name with a space in between.
 *
 *   Sample input to the function:    ['r','a','m'] and ['k','u','m','a','r']
 *   Sample return from the function: ['r','a','m',' ','k','u','m','a','r']
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q48_JoinFirstAndLastName {

    public static char[] joinFullName(char[] firstName, char[] lastName) {
        // A missing name is treated as an empty name
        int firstLength = (firstName == null) ? 0 : firstName.length;
        int lastLength = (lastName == null) ? 0 : lastName.length;

        // The space belongs only between two real names, never at an edge
        boolean needsSpace = firstLength > 0 && lastLength > 0;
        int spaceCount = needsSpace ? 1 : 0;

        char[] fullName = new char[firstLength + spaceCount + lastLength];
        int writeIndex = 0;

        for (int index = 0; index < firstLength; index++) {
            fullName[writeIndex] = firstName[index];
            writeIndex++;
        }

        if (needsSpace) {
            fullName[writeIndex] = ' ';
            writeIndex++;
        }

        for (int index = 0; index < lastLength; index++) {
            fullName[writeIndex] = lastName[index];
            writeIndex++;
        }

        return fullName;
    }

    // ======================================================================
    //  Test cases for joinFullName: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> joinFullName(new char[]{'r', 'a', 'm'}, new char[]{'k', 'u', 'm', 'a', 'r'}),
                new char[]{'r', 'a', 'm', ' ', 'k', 'u', 'm', 'a', 'r'});
        run(2, "First name null",
                () -> joinFullName((char[]) null, new char[]{'k', 'u', 'm', 'a', 'r'}),
                new char[]{'k', 'u', 'm', 'a', 'r'});
        run(3, "Last name null",
                () -> joinFullName(new char[]{'r', 'a', 'm'}, (char[]) null),
                new char[]{'r', 'a', 'm'});
        run(4, "Both null",
                () -> joinFullName((char[]) null, (char[]) null),
                new char[]{});
        run(5, "First name empty",
                () -> joinFullName(new char[]{}, new char[]{'s', 'e', 'n'}),
                new char[]{'s', 'e', 'n'});
        run(6, "Last name empty",
                () -> joinFullName(new char[]{'a', 'm', 'i', 't'}, new char[]{}),
                new char[]{'a', 'm', 'i', 't'});
        run(7, "Both empty",
                () -> joinFullName(new char[]{}, new char[]{}),
                new char[]{});
        run(8, "One-letter names",
                () -> joinFullName(new char[]{'a'}, new char[]{'b'}),
                new char[]{'a', ' ', 'b'});
        run(9, "Capitals kept as given",
                () -> joinFullName(new char[]{'R', 'a', 'm'}, new char[]{'K', 'u', 'm', 'a', 'r'}),
                new char[]{'R', 'a', 'm', ' ', 'K', 'u', 'm', 'a', 'r'});
        run(10, "Space inside the first name",
                () -> joinFullName(new char[]{'s', 'a', 'i', ' ', 'r', 'a', 'm'}, new char[]{'k'}),
                new char[]{'s', 'a', 'i', ' ', 'r', 'a', 'm', ' ', 'k'});
        run(11, "Symbol and digit in a name",
                () -> joinFullName(new char[]{'l', 'i', '-', 'n', 'a'}, new char[]{'r', 'o', 'y', '2'}),
                new char[]{'l', 'i', '-', 'n', 'a', ' ', 'r', 'o', 'y', '2'});
        run(12, "Same first and last name",
                () -> joinFullName(new char[]{'r', 'a', 'm'}, new char[]{'r', 'a', 'm'}),
                new char[]{'r', 'a', 'm', ' ', 'r', 'a', 'm'});

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
