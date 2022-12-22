public class MinimumDistance {
    public static void main(String[] args) {
        System.out.println("This is my test method.");
        /*int[] nums = {3, 2, 4};
        int[] res = twoSum(nums, 6);
        System.out.println(res[0] + "," + res[1]);*/
        /*String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));*/
        int[] a = {1,2,3,2};
        System.out.println("Min Dist: " + minDist(a,1, 2));
    }

    private static int minDist(int a[], int x, int y) {
        // code here
        // Initialize all the required value
        int minDist = Integer.MAX_VALUE, start=-1, end=-1;
        for(int i=0;i<a.length;i++) {
            /** Initialize start and end if the current element matches with the value*/
            if(a[i] == x) start = i;
            else if(a[i] == y) end = i;
            if(start != -1 && end != -1) {
                // Calculate the value of min distance
                minDist = Math.min(minDist,Math.abs(end - start));
            }
        }
        if(start==-1 || end ==-1)return -1;
        else return minDist;
    }
}
