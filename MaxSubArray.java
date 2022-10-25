package problem;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = Stream.of(-2, -3, 4, -1, -2, 1, 5, -3).mapToInt(Integer::valueOf).toArray();
        System.out.println(maxSubarraySum(arr, 8));
    }
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    private static int maxSubarraySum(int arr[], int n){

        // Your code here
        int max = Integer.MIN_VALUE;
        int max_end_here = 0;

        for(int i=0;i<arr.length;i++) {
            max_end_here += arr[i];
            if(max<max_end_here) {
                max = max_end_here;
            }
            if(max_end_here<0) {
                max_end_here = 0;
            }
        }
        return max;
    }
}
