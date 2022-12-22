
import java.util.ArrayList;
import java.util.List;

public class TwoSumProblem {
    public static void main(String[] args) {
        System.out.println("This is my test method.");
        int[] nums = {3, 2, 4};
        int[] res = twoSum(nums, 6);
        System.out.println(res[0] + "," + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (list.contains(num)) {
                start = i;
                end = list.indexOf(num);
                break;
            } else {
               list.add(nums[i]);
            }
        }
        return new int[]{start, end};
    }

}
