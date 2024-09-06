import java.util.*;
public class left_diagonal {
    static int left_sum(int a[][],int m,int n){
        int sum =0;
        int max = Math.max(m,n);
        int arr[][] = new int[max][max];

        for(int i = 0; i < max; i++){
            for(int j =0; j < max; j++){
                arr[i][j] = 1;
            }
        }
        //copy elements of smaller array into the bigger array
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = a[i][j];
            }
        }

        for(int i=0; i< max; i++){
            sum+=arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n= sc.nextInt();

        int a[][] = new int[m][n];

        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int res = left_sum(a,m,n);
        System.out.println(res);

    }
}
