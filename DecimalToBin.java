
public class DecimalToBin {
    public static void main(String[] args) {
        System.out.println("5 in Binary: ");
        printDecimalToBinary(5);

        System.out.println("\n7 in Binary: ");
        printDecimalToBinary(7);

        System.out.println("\n16 in Binary: ");
        printDecimalToBinary(16);
        System.out.println("\nPrint Binary to Decimal");
        System.out.println("Printing 101 in Decimal: "+printBinaryToDecimal(101, 0));
        System.out.println("Printing 111 in Decimal: "+printBinaryToDecimal(111, 0));
        System.out.println("Printing 1000 in Decimal: "+printBinaryToDecimal(10000, 0));
    }

    /**
     * Recursive program to print Decimal to Binary
     * @param num
     */
    public static void printDecimalToBinary(int num) {
        if(num==0) return;
        printDecimalToBinary(num/2);
        System.out.print(num%2);
    }

    /**
     * Recursive program to print Binary to Decimal
     * @param num
     * @param index
     * @return
     */
    public static int printBinaryToDecimal(int num, int index) {
        if(num==0) return 0;
        return (int) (num%10*Math.pow(2, index))+printBinaryToDecimal(num/10, index+1);
    }

}
