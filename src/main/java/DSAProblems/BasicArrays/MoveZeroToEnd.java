package DSAProblems.BasicArrays;
public class MoveZeroToEnd {

    public void movingZeros(int arr[], int n) {

        // j will store the index of first zero
        // initialize with -1 → means "no zero found yet"
        int j = -1;

        // 🔹 STEP 1: Find first zero in the array
        for (int i = 0; i < n; i++) {

            // if current element is zero
            if (arr[i] == 0) {

                // store its index in j
                j = i;

                // break because we only need first zero
                break;
            }
        }

        // 🔹 If no zero found → array already valid
        // nothing to move
        if (j == -1) return;

        // 🔹 STEP 2: Start scanning from next position of j
        // i will find non-zero elements
        for (int i = j + 1; i < n; i++) {

            // if non-zero element found
            if (arr[i] != 0) {

                // 🔸 Swap non-zero element with zero at j

                int temp = arr[i];   // store current non-zero
                arr[i] = arr[j];    // move zero to current position
                arr[j] = temp;      // move non-zero to correct position

                // 🔸 move j forward to next zero position
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,0,3,0,4,5,0,6,7};
        int n = arr.length;

        // create object
        MoveZeroToEnd obj = new MoveZeroToEnd();

        // call function
        obj.movingZeros(arr, n);

        // print final array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
