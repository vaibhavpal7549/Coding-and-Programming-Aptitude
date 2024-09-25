


import java.util.Scanner;

public class sum_even_odd {
    private static Scanner sc;

    public static void main(String[] args) {
        int size, evenSum = 0, oddSum = 0;
        sc = new Scanner(System.in);

        
        System.out.print("Please Enter Number of elements in an array: ");
        size = sc.nextInt();

        int[] arr = new int[size];

    
        System.out.println("Please Enter " + size + " elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }


        System.out.println("\nThe Sum of Even Numbers in this Array = " + evenSum);
        System.out.println("The Sum of Odd Numbers in this Array = " + oddSum);
    }
}