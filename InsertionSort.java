import java.util.*;
public class InsertionSort {

    static int[] insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4};

        int[] result = insertionSort(arr);

        System.out.println(Arrays.toString(result));
    }
}
