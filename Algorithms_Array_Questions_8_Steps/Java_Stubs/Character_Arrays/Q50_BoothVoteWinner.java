import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 50 · Find the winner across three polling booths
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Votes from three polling booths are given ('A' or 'B' for each voter). Return the
 *   candidate with the most votes overall.
 *
 *   Sample input to the function:    ['A','B','A'], ['B','B','A','B'] and ['A','A']
 *   Sample return from the function: 'A'
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside findBoothWinner(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q50_BoothVoteWinner.java  then  java Q50_BoothVoteWinner
 *      (or run it in one step with:  java Q50_BoothVoteWinner.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q50_BoothVoteWinner {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static Character findBoothWinner(char[] boothOne, char[] boothTwo, char[] boothThree) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("findBoothWinner is not written yet");
    }

    // ======================================================================
    //  Test cases for findBoothWinner: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findBoothWinner(new char[]{'A', 'B', 'A'}, new char[]{'B', 'B', 'A', 'B'}, new char[]{'A', 'A'}),
                'A');
        run(2, "B wins",
                () -> findBoothWinner(new char[]{'B'}, new char[]{'A', 'B'}, new char[]{'B', 'A', 'B'}),
                'B');
        run(3, "All booths null",
                () -> findBoothWinner((char[]) null, (char[]) null, (char[]) null),
                null);
        run(4, "All booths empty",
                () -> findBoothWinner(new char[]{}, new char[]{}, new char[]{}),
                null);
        run(5, "One booth null",
                () -> findBoothWinner((char[]) null, new char[]{'B', 'B'}, new char[]{'A'}),
                'B');
        run(6, "Tie",
                () -> findBoothWinner(new char[]{'A', 'B'}, new char[]{'A'}, new char[]{'B'}),
                null);
        run(7, "Last booth decides",
                () -> findBoothWinner(new char[]{'A', 'B'}, new char[]{'B', 'A'}, new char[]{'B'}),
                'B');
        run(8, "Fewer booths won, more votes",
                () -> findBoothWinner(new char[]{'B', 'B', 'A'}, new char[]{'B', 'B', 'A'}, new char[]{'A', 'A', 'A', 'A'}),
                'A');
        run(9, "Lower-case votes",
                () -> findBoothWinner(new char[]{'a', 'a', 'a'}, new char[]{'B'}, new char[]{'B'}),
                'A');
        run(10, "Spoiled: space, letter, symbol",
                () -> findBoothWinner(new char[]{'A', ' ', 'C'}, new char[]{'#', 'A'}, new char[]{'B', '?'}),
                'A');
        run(11, "Only spoiled votes",
                () -> findBoothWinner(new char[]{' ', '1'}, new char[]{'X'}, new char[]{}),
                null);
        run(12, "Single voter overall",
                () -> findBoothWinner(new char[]{}, new char[]{'B'}, new char[]{}),
                'B');

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
