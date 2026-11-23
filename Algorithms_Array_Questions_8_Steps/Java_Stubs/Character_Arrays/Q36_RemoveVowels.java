import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 36 · Remove every vowel from a word
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the array with all vowels removed.
 *
 *   Sample input to the function:    ['p','r','o','g','r','a','m']
 *   Sample return from the function: ['p','r','g','r','m']
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside removeVowels(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q36_RemoveVowels.java  then  java Q36_RemoveVowels
 *      (or run it in one step with:  java Q36_RemoveVowels.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q36_RemoveVowels {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static char[] removeVowels(char[] word) {
        // TODO: write your code here.
        // Delete the line below once your function returns its answer.
        throw new UnsupportedOperationException("removeVowels is not written yet");
    }

    // ======================================================================
    //  Test cases for removeVowels: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> removeVowels(new char[]{'p', 'r', 'o', 'g', 'r', 'a', 'm'}),
                new char[]{'p', 'r', 'g', 'r', 'm'});
        run(2, "Null input",
                () -> removeVowels((char[]) null),
                new char[]{});
        run(3, "Empty",
                () -> removeVowels(new char[]{}),
                new char[]{});
        run(4, "Single consonant",
                () -> removeVowels(new char[]{'x'}),
                new char[]{'x'});
        run(5, "Single capital vowel",
                () -> removeVowels(new char[]{'U'}),
                new char[]{});
        run(6, "All vowels",
                () -> removeVowels(new char[]{'a', 'e', 'i', 'o', 'u'}),
                new char[]{});
        run(7, "No vowels ('y' is kept)",
                () -> removeVowels(new char[]{'r', 'h', 'y', 't', 'h', 'm'}),
                new char[]{'r', 'h', 'y', 't', 'h', 'm'});
        run(8, "Capital vowels",
                () -> removeVowels(new char[]{'A', 'p', 'p', 'l', 'E'}),
                new char[]{'p', 'p', 'l'});
        run(9, "Vowel first and last",
                () -> removeVowels(new char[]{'o', 'n', 'i', 'o', 'n'}),
                new char[]{'n', 'n'});
        run(10, "Spaces, digits, symbols",
                () -> removeVowels(new char[]{'i', 'o', 't', ' ', '4', '.', '0'}),
                new char[]{'t', ' ', '4', '.', '0'});
        run(11, "Repeated vowels",
                () -> removeVowels(new char[]{'b', 'o', 'o', 'k', 'k', 'e', 'e', 'p', 'e', 'r'}),
                new char[]{'b', 'k', 'k', 'p', 'r'});
        run(12, "Mixed case word",
                () -> removeVowels(new char[]{'I', 'n', 'D', 'I', 'a'}),
                new char[]{'n', 'D'});

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
