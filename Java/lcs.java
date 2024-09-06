import java.util.*;
public class lcs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int p =sc.nextInt();
        int q = sc.nextInt();
        String a =sc.next();
        String b = sc.next();
        System.out.println(lcs_string(p,q,a,b));
    }

    static int lcs_string(int x,int y,String a,String b)
    {
        int dp[][] = new int[x+1][y+1];

        for(int i = 0; i <=x;i++)
            {
                for(int j = 0; j<=y; j++)
                    {
                        if(i == 0 || j==0 )
                        dp[i][j] = 0;

                        else if(a.charAt(i-1) == b.charAt(j-1))
                        {
                            dp[i][j] = 1+ dp[i-1][j-1];
                        }

                        else
                        {
                            dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                        }
                    }
            }
            return dp[x][y];
    }
}
