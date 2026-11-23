import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 17 · Replace each number by the sum of its digits
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return a new array where each number is replaced by the sum of its digits.
 *
 *   Sample input to the function:    [123, 45, 9]
 *   Sample return from the function: [6, 9, 9]
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q17_DigitSumArray {

    public static int[] replaceWithDigitSums(int[] numbers) {
        // Early exit: no numbers means an empty answer
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        // A new array, so the caller's numbers are never changed
        int[] digitSums = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            digitSums[index] = sumDigits(numbers[index]);
        }

        return digitSums;
    }

    private static int sumDigits(int number) {
        // Widen to long first: Math.abs(Integer.MIN_VALUE) is still negative as an int
        long remaining = Math.abs((long) number);
        int digitSum = 0;

        while (remaining > 0) {
            int lastDigit = (int) (remaining % 10);
            digitSum += lastDigit;
            remaining = remaining / 10;
        }

        return digitSum;
    }

    // ======================================================================
    //  Test cases for replaceWithDigitSums: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> replaceWithDigitSums(new int[]{123, 45, 9}),
                new int[]{6, 9, 9});
        run(2, "Null input",
                () -> replaceWithDigitSums((int[]) null),
                new int[]{});
        run(3, "Empty",
                () -> replaceWithDigitSums(new int[]{}),
                new int[]{});
        run(4, "Single number",
                () -> replaceWithDigitSums(new int[]{9875}),
                new int[]{29});
        run(5, "Zero and zeros inside",
                () -> replaceWithDigitSums(new int[]{0, 10, 100, 505}),
                new int[]{0, 1, 1, 10});
        run(6, "Only negatives",
                () -> replaceWithDigitSums(new int[]{-123, -45}),
                new int[]{6, 9});
        run(7, "Duplicates, mixed signs",
                () -> replaceWithDigitSums(new int[]{45, -45, 45}),
                new int[]{9, 9, 9});
        run(8, "Single digits stay the same",
                () -> replaceWithDigitSums(new int[]{1, 2, 3}),
                new int[]{1, 2, 3});
        run(9, "Sum is not reduced to one digit",
                () -> replaceWithDigitSums(new int[]{19, 91}),
                new int[]{10, 10});
        run(10, "Many digits",
                () -> replaceWithDigitSums(new int[]{99999, 1000000}),
                new int[]{45, 1});
        run(11, "Extreme values",
                () -> replaceWithDigitSums(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}),
                new int[]{46, 47});

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
