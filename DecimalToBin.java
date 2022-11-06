public class DecimalToBin {
    public static void main(String[] args) {
        System.out.println("5 in Binary: ");
        printInBinFromDec(5);

        System.out.println("\n7 in Binary: ");
        printInBinFromDec(7);

        System.out.println("\n16 in Binary: ");
        printInBinFromDec(16);
    }

    public static void printInBinFromDec(int num) {
        if(num==0) return;
        printInBinFromDec(num/2);
        System.out.print(num%2);
    }

}
