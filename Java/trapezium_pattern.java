import java.util.*;
public class trapezium_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i = 0 ; i < n; i++){
            for(j=0; j < n ; j++){
                if( j < n-i-1)
                System.out.println("*");
                else
                System.out.println(".");
            }
            for(j = 0; j < n-1; j++){
                if( j < i)
                System.out.println(".");
                else
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
