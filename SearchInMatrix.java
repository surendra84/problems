package problem;

/**
 * Search an element in the matrix
 * search-in-row-wise-and-column-wise-sorted-matrix
 */
    public class SearchInMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        // Function call
        search(mat, 4, 29);
    }

    private static void search(int[][] mat, int n, int num) {
        int i=0, j=n-1;
        //Start a look from last row in the matrix
        while(i<n && j>0) {
            // check if the number and got matched with matrix, then return the print message that element found
            if(mat[i][j]==num) {
                System.out.println(num+" Element found at i:"+i+",j:"+j);
                return;
            }
            //if the current number is greater than the number which to search, then decreate the last column
            if(mat[i][j]>num) {
                j--;
            } else {
                // If elements less thant give number then increase row and try to find with same column
                i++;
            }
        }
        System.out.println(num+ " Element not found");
    }
}
