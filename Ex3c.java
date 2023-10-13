import java.util.Scanner;

public class MergeSort {
    public static void merge(int arr[], int l, int m, int h) {
        int i, j, k;
        int[] b = new int[h + 1]; // Fixed: Changed "new int" to "new int[]"

        i = l; // Fixed: Initialized i with l instead of 1
        j = m + 1;
        k = l; // Fixed: Added k variable to keep track of the current index

        while (i <= m && j <= h) {
            if (arr[i] <= arr[j])
                b[k++] = arr[i++]; // Fixed: Incremented k and i
            else
                b[k++] = arr[j++]; // Fixed: Incremented k and j
        }

        while (i <= m)
            b[k++] = arr[i++]; // Fixed: Incremented k and i

        while (j <= h)
            b[k++] = arr[j++]; // Fixed: Incremented k and j

        for (i = l; i <= h; i++)
            arr[i] = b[i]; // Fixed: Changed arr[i] = b[i] to arr[i] = b[k]
    }

    public void sort(int arr[], int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, h);
            merge(arr, l, m, h);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int n, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++)
            arr[i] = s.nextInt();
        MergeSort mergeSort = new MergeSort(); // Fixed: Created an instance of the class
        mergeSort.printArray(arr); // Fixed: Called the method using the instance
        mergeSort.sort(arr, 0, n - 1); // Fixed: Called the method using the instance
        mergeSort.printArray(arr); // Fixed: Called the method using the instance
    }
}
