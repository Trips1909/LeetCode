import java.util.*;
public class lps {
    public static int longestPalindromeSubseq(String s){
        int n =s.length();
        int [][]dp = new int[n][n];
        for(int i =0; i< n; i++)
            {
                dp[i][i] =1 ;
            }
        for(int length =2; length <= n; length++){
            for(int start = 0; start <= n-length; start++){
                int end = start +length -1;
                if(s.charAt(start) == s.charAt(end)){
                    dp[start][end] = 2+ dp[start+1][end -1];
                }else{
                    dp[start][end] = Math.max(dp[start+1][end],dp[start][end -1]);
                }
            }
        }
        return dp[0][n-1];
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            String s= sc.next();

            System.out.println(longestPalindromeSubseq(s));
        }
}


