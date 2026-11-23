import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 49 · Are the two words anagrams?
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return true if both arrays have exactly the same letters, in any order.
 *
 *   Sample input to the function:    ['s','i','l','e','n','t'] and ['l','i','s','t','e','n']
 *   Sample return from the function: true
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q49_IsAnagram {

    public static boolean isAnagram(char[] firstWord, char[] secondWord) {
        // Early exit: a missing word cannot be compared
        if (firstWord == null || secondWord == null) {
            return false;
        }

        // One box for every possible char, so digits and symbols are counted too
        int[] tally = new int[Character.MAX_VALUE + 1];

        for (int index = 0; index < firstWord.length; index++) {
            char letter = Character.toLowerCase(firstWord[index]);
            tally[letter]++;
        }

        // Different lengths can never be anagrams
        boolean hasSameLetters = firstWord.length == secondWord.length;

        // Equal lengths and no box below zero means every count matches
        for (int index = 0; index < secondWord.length && hasSameLetters; index++) {
            char letter = Character.toLowerCase(secondWord[index]);
            tally[letter]--;

            if (tally[letter] < 0) {
                hasSameLetters = false;
            }
        }

        return hasSameLetters;
    }

    // ======================================================================
    //  Test cases for isAnagram: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> isAnagram(new char[]{'s', 'i', 'l', 'e', 'n', 't'}, new char[]{'l', 'i', 's', 't', 'e', 'n'}),
                true);
        run(2, "First array null",
                () -> isAnagram((char[]) null, new char[]{'a'}),
                false);
        run(3, "Second array null",
                () -> isAnagram(new char[]{'a'}, (char[]) null),
                false);
        run(4, "Both empty",
                () -> isAnagram(new char[]{}, new char[]{}),
                true);
        run(5, "Different lengths",
                () -> isAnagram(new char[]{'a', 'b'}, new char[]{'a', 'b', 'b'}),
                false);
        run(6, "Same letters, different counts",
                () -> isAnagram(new char[]{'a', 'a', 'b'}, new char[]{'a', 'b', 'b'}),
                false);
        run(7, "One letter differs",
                () -> isAnagram(new char[]{'r', 'a', 't'}, new char[]{'c', 'a', 'r'}),
                false);
        run(8, "Mismatch in the last letter",
                () -> isAnagram(new char[]{'a', 'b', 'c', 'c'}, new char[]{'a', 'b', 'c', 'd'}),
                false);
        run(9, "Same word, same order",
                () -> isAnagram(new char[]{'j', 'a', 'v', 'a'}, new char[]{'j', 'a', 'v', 'a'}),
                true);
        run(10, "Upper and lower case",
                () -> isAnagram(new char[]{'L', 'i', 's', 't', 'e', 'n'}, new char[]{'s', 'i', 'l', 'e', 'n', 't'}),
                true);
        run(11, "Space counts as a character",
                () -> isAnagram(new char[]{'a', ' ', 'b'}, new char[]{'b', 'a', 'a'}),
                false);
        run(12, "Digits and symbols",
                () -> isAnagram(new char[]{'1', '2', '#', ' '}, new char[]{' ', '#', '2', '1'}),
                true);
        run(13, "Single different characters",
                () -> isAnagram(new char[]{'x'}, new char[]{'y'}),
                false);

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
