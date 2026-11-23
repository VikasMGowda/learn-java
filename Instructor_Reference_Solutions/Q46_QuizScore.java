import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 46 · Score a quiz against the answer key
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Given a student's quiz answers and the answer key, return the score (1 mark per
 *   correct answer).
 *
 *   Sample input to the function:    ['A','C','B','D','A'] and ['A','B','B','D','C']
 *   Sample return from the function: 3
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q46_QuizScore {

    public static int calculateQuizScore(char[] answers, char[] answerKey) {
        // Early exit: without both sheets nothing can be marked
        if (answers == null || answerKey == null) {
            return 0;
        }

        int score = 0;

        // A student may skip the last questions; mark only what both sheets have
        int questionCount = Math.min(answers.length, answerKey.length);

        for (int index = 0; index < questionCount; index++) {
            // 'a' and 'A' are the same option
            char given = Character.toUpperCase(answers[index]);
            char correct = Character.toUpperCase(answerKey[index]);

            if (given == correct) {
                score++;
            }
        }

        return score;
    }

    // ======================================================================
    //  Test cases for calculateQuizScore: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> calculateQuizScore(new char[]{'A', 'C', 'B', 'D', 'A'}, new char[]{'A', 'B', 'B', 'D', 'C'}),
                3);
        run(2, "Answers null",
                () -> calculateQuizScore((char[]) null, new char[]{'A', 'B'}),
                0);
        run(3, "Answer key null",
                () -> calculateQuizScore(new char[]{'A', 'B'}, (char[]) null),
                0);
        run(4, "Both empty",
                () -> calculateQuizScore(new char[]{}, new char[]{}),
                0);
        run(5, "Single question, correct",
                () -> calculateQuizScore(new char[]{'C'}, new char[]{'C'}),
                1);
        run(6, "All correct",
                () -> calculateQuizScore(new char[]{'B', 'D', 'A', 'C'}, new char[]{'B', 'D', 'A', 'C'}),
                4);
        run(7, "All wrong",
                () -> calculateQuizScore(new char[]{'A', 'A', 'A'}, new char[]{'B', 'C', 'D'}),
                0);
        run(8, "Right letters, wrong questions",
                () -> calculateQuizScore(new char[]{'A', 'B', 'C', 'D'}, new char[]{'D', 'C', 'B', 'A'}),
                0);
        run(9, "Lower-case answers",
                () -> calculateQuizScore(new char[]{'a', 'c', 'B'}, new char[]{'A', 'C', 'D'}),
                2);
        run(10, "Skipped: space and symbols",
                () -> calculateQuizScore(new char[]{'A', ' ', '-', '?'}, new char[]{'A', 'B', 'C', 'D'}),
                1);
        run(11, "Fewer answers than the key",
                () -> calculateQuizScore(new char[]{'A', 'B'}, new char[]{'A', 'B', 'C', 'D'}),
                2);
        run(12, "More answers than the key",
                () -> calculateQuizScore(new char[]{'D', 'C', 'B'}, new char[]{'D', 'A'}),
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
