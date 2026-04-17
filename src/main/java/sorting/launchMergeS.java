package sorting;

public class launchMergeS {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // divide
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;      // left subarray
        int j = mid + 1;   // right subarray
        int k = 0;

        // compare both sides
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right elements
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 4, 5, 9, 2, 7};

        System.out.println("Before Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}