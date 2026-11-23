import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 26 · Count vowels and consonants
 * Character arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Count the vowels and consonants. Return both as [vowels, consonants].
 *
 *   Sample input to the function:    ['a','p','p','l','e']
 *   Sample return from the function: [2, 3]
 *
 * REFERENCE SOLUTION (for instructors). Run it to confirm every test passes.
 */
public class Q26_CountVowelsConsonants {

    public static int[] countVowelsConsonants(char[] letters) {
        // Early exit: no characters means nothing to count
        if (letters == null || letters.length == 0) {
            return new int[]{0, 0};
        }

        int vowelCount = 0;
        int consonantCount = 0;

        for (int index = 0; index < letters.length; index++) {
            char current = letters[index];

            // A consonant must be a real letter: spaces, digits and symbols count as neither
            if (isVowel(current)) {
                vowelCount++;
            } else if (isEnglishLetter(current)) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    private static boolean isVowel(char symbol) {
        // Compare in small form so 'A' and 'a' get the same answer
        char lower = Character.toLowerCase(symbol);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    private static boolean isEnglishLetter(char symbol) {
        return (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z');
    }

    // ======================================================================
    //  Test cases for countVowelsConsonants: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> countVowelsConsonants(new char[]{'a', 'p', 'p', 'l', 'e'}),
                new int[]{2, 3});
        run(2, "Null input",
                () -> countVowelsConsonants((char[]) null),
                new int[]{0, 0});
        run(3, "Empty",
                () -> countVowelsConsonants(new char[]{}),
                new int[]{0, 0});
        run(4, "Single vowel",
                () -> countVowelsConsonants(new char[]{'e'}),
                new int[]{1, 0});
        run(5, "Single consonant",
                () -> countVowelsConsonants(new char[]{'z'}),
                new int[]{0, 1});
        run(6, "All capitals",
                () -> countVowelsConsonants(new char[]{'A', 'P', 'P', 'L', 'E'}),
                new int[]{2, 3});
        run(7, "Mixed case",
                () -> countVowelsConsonants(new char[]{'I', 'n', 'D', 'i', 'A'}),
                new int[]{3, 2});
        run(8, "Space in the middle",
                () -> countVowelsConsonants(new char[]{'g', 'o', ' ', 'u', 'p'}),
                new int[]{2, 2});
        run(9, "Digits and symbols",
                () -> countVowelsConsonants(new char[]{'r', '2', 'd', '2', '!'}),
                new int[]{0, 2});
        run(10, "No letters at all",
                () -> countVowelsConsonants(new char[]{'1', '@', ' ', '#'}),
                new int[]{0, 0});
        run(11, "'y' is a consonant",
                () -> countVowelsConsonants(new char[]{'s', 'k', 'y'}),
                new int[]{0, 3});
        run(12, "All vowels, both cases",
                () -> countVowelsConsonants(new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}),
                new int[]{10, 0});

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
