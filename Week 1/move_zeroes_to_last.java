// package Java.C_AND_PA_GP;

import java.util.Arrays;
import java.util.Scanner;

public class move_zeroes_to_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Length ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements ");
        int [] nums = new int[n];
        for(int i = 0;i<n;i++){
            int s = sc.nextInt();
            nums[i] = s;
        }
        System.out.println("Original Arrays is "+Arrays.toString(nums));
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if (nums[i] == 0 && nums[j]!=0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                }
            }
        }
        System.out.println("Final Arrays is "+Arrays.toString(nums));
    }
    
}


