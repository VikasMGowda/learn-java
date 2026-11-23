import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 22 · Numbers in the first array but not in the second
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return the numbers in the first array that are not present in the second array.
 *
 *   Sample input to the function:    [1, 4, 6, 8, 10] and [4, 8, 12]
 *   Sample return from the function: [1, 6, 10]
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q22_NumbersNotInSecond {

    public static int[] findNumbersNotInSecond(int[] firstNumbers, int[] secondNumbers) {
        // Early exit: no first array means there is nothing to keep
        if (firstNumbers == null || firstNumbers.length == 0) {
            return new int[0];
        }

        // In the worst case every number is kept, so reserve room for all of them
        int[] kept = new int[firstNumbers.length];
        int keptCount = 0;

        for (int index = 0; index < firstNumbers.length; index++) {
            int current = firstNumbers[index];

            if (!isPresent(secondNumbers, current)) {
                kept[keptCount] = current;
                keptCount++;
            }
        }

        // Only the first keptCount slots are the answer; the rest are unused zeros
        return Arrays.copyOf(kept, keptCount);
    }

    private static boolean isPresent(int[] numbers, int target) {
        boolean found = false;

        // A null array contains nothing, so there is nothing to search
        if (numbers != null) {
            // Stop as soon as the target is found
            for (int position = 0; position < numbers.length && !found; position++) {
                if (numbers[position] == target) {
                    found = true;
                }
            }
        }

        return found;
    }

    // ======================================================================
    //  Test cases for findNumbersNotInSecond: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findNumbersNotInSecond(new int[]{1, 4, 6, 8, 10}, new int[]{4, 8, 12}),
                new int[]{1, 6, 10});
        run(2, "Null first array",
                () -> findNumbersNotInSecond((int[]) null, new int[]{1, 2}),
                new int[]{});
        run(3, "Null second array",
                () -> findNumbersNotInSecond(new int[]{1, 2}, (int[]) null),
                new int[]{1, 2});
        run(4, "Empty first array",
                () -> findNumbersNotInSecond(new int[]{}, new int[]{1}),
                new int[]{});
        run(5, "Empty second array",
                () -> findNumbersNotInSecond(new int[]{3, 1}, new int[]{}),
                new int[]{3, 1});
        run(6, "Single element, removed",
                () -> findNumbersNotInSecond(new int[]{5}, new int[]{5}),
                new int[]{});
        run(7, "Everything removed",
                () -> findNumbersNotInSecond(new int[]{4, 8}, new int[]{8, 4, 12}),
                new int[]{});
        run(8, "Nothing removed",
                () -> findNumbersNotInSecond(new int[]{1, 2, 3}, new int[]{7, 8}),
                new int[]{1, 2, 3});
        run(9, "Duplicates in first",
                () -> findNumbersNotInSecond(new int[]{3, 3, 5, 3}, new int[]{5}),
                new int[]{3, 3, 3});
        run(10, "Duplicates in second",
                () -> findNumbersNotInSecond(new int[]{2, 4, 6}, new int[]{4, 4, 4}),
                new int[]{2, 6});
        run(11, "Unsorted, order kept",
                () -> findNumbersNotInSecond(new int[]{9, 2, 7, 2}, new int[]{7}),
                new int[]{9, 2, 2});
        run(12, "Zero is a kept number",
                () -> findNumbersNotInSecond(new int[]{0, -1, 5, 0}, new int[]{5}),
                new int[]{0, -1, 0});
        run(13, "Extreme values",
                () -> findNumbersNotInSecond(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, new int[]{Integer.MAX_VALUE}),
                new int[]{Integer.MIN_VALUE, 0});

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
