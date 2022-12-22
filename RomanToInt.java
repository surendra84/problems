class RomanToInt {
   public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXC"));
    }
    public static int romanToInt(String s) {
        int total = 0;
        /** Start a loop to calculate the integer from roman */
        for(int i=0;i<s.length();i++) {
            int num1 = getRomanValue(s.charAt(i));
            if(i+1<s.length()) {
                int num2 = getRomanValue(s.charAt(i+1));
                // Calculate with num1 and num2, if num1 is greater then add with total 
                // otherwise substract from total
                if(num1>=num2) total += num1;
                else total -=num1;
            } else {
                total += num1;
            }
        }        
        return total;
    }
    /**Method to get the Roman value based on provided roman characters */
    private static int getRomanValue(char ch) {
        int val = -1;
        switch(ch) {
            case 'I': val=1; break;
            case 'V': val=5; break;
            case 'X': val=10; break;
            case 'L': val=50; break;
            case 'C': val=100; break;
            case 'D': val=500; break;
            case 'M': val=1000; break;
            default: val=-1; break;
        }
        return val;
    }
}
