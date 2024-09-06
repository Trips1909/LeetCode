import java.util.*;
public class stock_span {
    static int[] calculatespan(int[] stockPrices){
        int n = stockPrices.length;
        int[] span = new int[n];
        span[0] = 1;

       for(int i = 1; i < n; i++){
        span[i] = 1;
        int j =i -1;
        while(j >= 0 && stockPrices[i] >= stockPrices[j]){
            span[i]++;
            j--;
        }
       }
       return span;
    }
}
