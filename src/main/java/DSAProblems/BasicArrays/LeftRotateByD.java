package DSAProblems.BasicArrays;

public class LeftRotateByD {
    public void reverse(int arr [],int start ,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotatebyd(int arr [],int n,int d) {
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;

        LeftRotateByD lrbd = new LeftRotateByD();
        lrbd.rotatebyd(arr,n,d);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
