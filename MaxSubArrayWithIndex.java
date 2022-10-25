package problem;

import java.util.stream.Stream;

public class MaxSubArrayWithIndex {

    public static void main(String[] args) {
        int[] arr = Stream.of(-2, -3, 4, -1, -2, 1, 5, -3).mapToInt(Integer::valueOf).toArray();
        printMaxSubarraySumWithIndex(arr, 8);
    }

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    private static void printMaxSubarraySumWithIndex(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int max_end_here = 0, start = 0, end = 0, s = 0;

        for(int i=0;i<arr.length;i++) {
            max_end_here += arr[i];
            if(max<max_end_here) {
                max = max_end_here;
                start = s;
                end = i;
            }
            if(max_end_here<0) {
                max_end_here = 0;
                s = i+1;
            }
        }
        System.out.println("Maximum contiguous sum is " + max);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
}
