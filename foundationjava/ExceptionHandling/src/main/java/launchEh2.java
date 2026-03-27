import java.util.Scanner;

public class launchEh2 {
    public static void main(String[] args) {
        try {
            System.out.println("Connection is Establishing");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of an array");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("enter the element of an array");
            int elem = sc.nextInt();
            System.out.println("kindly enter position where element to be inserted");
            int index = sc.nextInt();
            arr[index] = elem;
            System.out.println("element is inserted at given index : " + arr[index] + "  at index" + index);
        } catch (ArithmeticException e){
            System.out.println("please enter non zero number");
        }
        catch (NegativeArraySizeException e) {
            System.out.println("please enter non negative and non zero number");

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please be in limits dont cross");

        } catch (Exception e) {
            System.out.println("some problem");
        }
        }
    }
