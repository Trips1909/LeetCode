import java.util.*;
public class count_setbits {
    int count_bits(int n) {
        int count=0;
        while( n >0){
            count += n & 1;
            n >>= 1;
        }
    }
    
}
