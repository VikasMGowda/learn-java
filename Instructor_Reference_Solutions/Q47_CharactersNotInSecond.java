import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 47 · Characters of the first array missing from the second
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the characters in the first array that are not present in the second array.
 *
 *   Sample input to the function:    ['a','b','c','d'] and ['b','d']
 *   Sample return from the function: ['a','c']
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q47_CharactersNotInSecond {

    public static char[] findCharactersNotInSecond(char[] firstLetters, char[] secondLetters) {
        // Early exit: no first array means nothing to keep
        if (firstLetters == null || firstLetters.length == 0) {
            return new char[0];
        }

        // The answer can never be longer than the first array
        char[] kept = new char[firstLetters.length];
        int keptCount = 0;

        for (int index = 0; index < firstLetters.length; index++) {
            char current = firstLetters[index];

            // "Not present" needs the whole second array checked, so ask the helper
            if (!isPresent(secondLetters, current)) {
                kept[keptCount] = current;
                keptCount++;
            }
        }

        // Trim the unused cells at the end
        return Arrays.copyOf(kept, keptCount);
    }

    private static boolean isPresent(char[] letters, char target) {
        // A missing second array contains nothing
        if (letters == null) {
            return false;
        }

        boolean isFound = false;

        for (int index = 0; index < letters.length && !isFound; index++) {
            if (letters[index] == target) {
                isFound = true;
            }
        }

        return isFound;
    }

    // ======================================================================
    //  Test cases for findCharactersNotInSecond: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findCharactersNotInSecond(new char[]{'a', 'b', 'c', 'd'}, new char[]{'b', 'd'}),
                new char[]{'a', 'c'});
        run(2, "First array null",
                () -> findCharactersNotInSecond((char[]) null, new char[]{'b'}),
                new char[]{});
        run(3, "Second array null",
                () -> findCharactersNotInSecond(new char[]{'x', 'y'}, (char[]) null),
                new char[]{'x', 'y'});
        run(4, "First array empty",
                () -> findCharactersNotInSecond(new char[]{}, new char[]{'a'}),
                new char[]{});
        run(5, "Second array empty",
                () -> findCharactersNotInSecond(new char[]{'p', 'q'}, new char[]{}),
                new char[]{'p', 'q'});
        run(6, "Everything removed",
                () -> findCharactersNotInSecond(new char[]{'b', 'd'}, new char[]{'d', 'b'}),
                new char[]{});
        run(7, "Nothing removed",
                () -> findCharactersNotInSecond(new char[]{'a', 'b'}, new char[]{'x', 'y'}),
                new char[]{'a', 'b'});
        run(8, "Duplicates in the first",
                () -> findCharactersNotInSecond(new char[]{'a', 'a', 'b', 'a'}, new char[]{'b'}),
                new char[]{'a', 'a', 'a'});
        run(9, "Duplicates in the second",
                () -> findCharactersNotInSecond(new char[]{'c', 'a', 't'}, new char[]{'t', 't', 't'}),
                new char[]{'c', 'a'});
        run(10, "Upper and lower case",
                () -> findCharactersNotInSecond(new char[]{'A', 'a', 'B'}, new char[]{'a'}),
                new char[]{'A', 'B'});
        run(11, "Space, digit and symbol",
                () -> findCharactersNotInSecond(new char[]{'1', ' ', '#', 'x'}, new char[]{' ', '#'}),
                new char[]{'1', 'x'});
        run(12, "First and last removed",
                () -> findCharactersNotInSecond(new char[]{'z', 'm', 'z'}, new char[]{'z'}),
                new char[]{'m'});
        run(13, "Order is kept",
                () -> findCharactersNotInSecond(new char[]{'d', 'c', 'b', 'a'}, new char[]{'c'}),
                new char[]{'d', 'b', 'a'});

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
