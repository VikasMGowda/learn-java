
public class MergeSort
{

    static void mergeSort(int[] array, int low, int high)
    {
        if (low >= high)
        {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        merge(array, low, mid, high);
    }

    static void merge(int[] array, int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high)
        {
            if (array[i] <= array[j])
            {
                temp[k] = array[i];
                i++;
            }
            else
            {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = array[i];
            i++;
            k++;
        }

        while (j <= high)
        {
            temp[k] = array[j];
            j++;
            k++;
        }

        for (i = low, k = 0; i <= high; i++, k++)
        {
            array[i] = temp[k];
        }
    }

    static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] array = {10, 4, 8, 5, 6, 3, 7, 2, 1};

        System.out.println("Before sorting:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("After sorting:");
        printArray(array);
    }
}
