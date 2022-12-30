class ClimbingStairs {
    
    public static void main(String[] args) {
      System.out.println(climbStairs(5)); // The result should be 8 here
    }
    private static int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int one=1,two=2,res=0;
        while(n>2) {
            res = one+two;
            one = two;
            two = res;
            n--;
        }
        return res;
    }
    
}
