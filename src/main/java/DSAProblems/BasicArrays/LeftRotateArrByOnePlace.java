package DSAProblems.BasicArrays;

public class LeftRotateArrByOnePlace {
    public void rotatingFromLeft(int []arr,int n){
        int temp = arr[0];
        for(int i =1; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

    }

    public static void main(String[] args) {
        int arr [] = {1,2,5,4,3,7};
        int n = arr.length;
        LeftRotateArrByOnePlace  lr = new LeftRotateArrByOnePlace();
        lr.rotatingFromLeft(arr,n);

        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
