import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 38 · Count the students who got grade A
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given the grades of a class, return how many students got 'A'.
 *
 *   Sample input to the function:    ['A','B','A','C','A','B']
 *   Sample return from the function: 3
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q38_CountGradeA {

    public static int countGradeA(char[] grades) {
        // Early exit: no grades means no student got an A
        if (grades == null || grades.length == 0) {
            return 0;
        }

        int gradeACount = 0;

        for (int index = 0; index < grades.length; index++) {
            char grade = grades[index];

            // Case-sensitive on purpose: only a capital 'A' is the grade A
            if (grade == 'A') {
                gradeACount++;
            }
        }

        return gradeACount;
    }

    // ======================================================================
    //  Test cases for countGradeA: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countGradeA(new char[]{'A', 'B', 'A', 'C', 'A', 'B'}),
                3);
        run(2, "Null input",
                () -> countGradeA((char[]) null),
                0);
        run(3, "Empty",
                () -> countGradeA(new char[]{}),
                0);
        run(4, "Single student with A",
                () -> countGradeA(new char[]{'A'}),
                1);
        run(5, "Single student without A",
                () -> countGradeA(new char[]{'B'}),
                0);
        run(6, "All A",
                () -> countGradeA(new char[]{'A', 'A', 'A', 'A'}),
                4);
        run(7, "No A at all",
                () -> countGradeA(new char[]{'B', 'C', 'D', 'F'}),
                0);
        run(8, "Lowercase a is not A (case)",
                () -> countGradeA(new char[]{'a', 'A', 'a'}),
                1);
        run(9, "A in first and last position",
                () -> countGradeA(new char[]{'A', 'C', 'B', 'A'}),
                2);
        run(10, "Symbols and spaces",
                () -> countGradeA(new char[]{'A', '+', ' ', '-', 'A'}),
                2);
        run(11, "Neighbour letters and digits",
                () -> countGradeA(new char[]{'B', '@', '4', 'A'}),
                1);

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
