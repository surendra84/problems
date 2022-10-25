package problem;


import java.util.Arrays;
import java.util.stream.IntStream;

public class FinxMaxOverlap {
    public static void main(String[] args) {
        int[] Entry= {1, 2,10, 5, 5};
        int[] Exit = {4, 5, 12, 9, 12};
        int[] res = findMaxGuests(Entry, Exit, 5);
        Arrays.stream(res).boxed().forEach(System.out::println);
    }
    public static int[] findMaxGuests(int[] Entry,int Exit[], int N){
        // add code here.
        int maxa = Arrays.stream(Entry).max().getAsInt();
        int maxb = Arrays.stream(Exit).max().getAsInt();
        int maxc = Math.max(maxa, maxb);
        int[] x = new int[maxc + 2];
        int curr = 0;
        int idx = 0;
        int maxy = Integer.MIN_VALUE;
        //fill the initial value with 0
        Arrays.fill(x, 0);

        //calculate the entry and exit data
        for(int i=0; i<N; i++) {
            ++x[Entry[i]];
            --x[Exit[i]+1];
        }
        //Calculate the lazy interval
        for(int i=0;i<maxc;i++) {
            curr += x[i];
            if(curr>maxy) {
                maxy = curr;
                idx = i;
            }
        }
       // return new int[]{maxy, idx};
        return IntStream.of(maxy, idx).toArray();
    }
}
