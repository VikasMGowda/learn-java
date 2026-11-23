import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 02 · Average mark of a student
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given the marks of a student, return the average mark.
 *
 *   Sample input to the function:    [70, 85, 90, 55]
 *   Sample return from the function: 75.0
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q02_AverageMarks {

    public static Double findAverageMark(int[] marks) {
        // Early exit: with no marks there is no average to report
        if (marks == null || marks.length == 0) {
            return null;
        }

        // long, so that adding very large marks can never overflow the total
        long total = 0;

        for (int index = 0; index < marks.length; index++) {
            int current = marks[index];
            total += current;
        }

        // Divide as decimals: whole-number division would drop the .5 in 72.5
        double average = (double) total / marks.length;

        return average;
    }

    // ======================================================================
    //  Test cases for findAverageMark: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findAverageMark(new int[]{70, 85, 90, 55}),
                75.0);
        run(2, "Null input",
                () -> findAverageMark((int[]) null),
                null);
        run(3, "Empty",
                () -> findAverageMark(new int[]{}),
                null);
        run(4, "Single mark",
                () -> findAverageMark(new int[]{88}),
                88.0);
        run(5, "Two marks, half in the answer",
                () -> findAverageMark(new int[]{70, 75}),
                72.5);
        run(6, "Repeating fraction",
                () -> findAverageMark(new int[]{90, 95, 96}),
                281.0 / 3);
        run(7, "All equal",
                () -> findAverageMark(new int[]{60, 60, 60}),
                60.0);
        run(8, "All zero (a real average)",
                () -> findAverageMark(new int[]{0, 0, 0}),
                0.0);
        run(9, "Boundary marks 0 and 100",
                () -> findAverageMark(new int[]{0, 100}),
                50.0);
        run(10, "Negative mark (penalty)",
                () -> findAverageMark(new int[]{-10, 20, 5}),
                5.0);
        run(11, "Duplicates",
                () -> findAverageMark(new int[]{85, 85, 40}),
                70.0);
        run(12, "Sum overflows an int",
                () -> findAverageMark(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}),
                2147483647.0);

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
