import java.util.*;
public class fibonacci {
    
    static int fib(int n,int []dp){
        if(n<=1)
        return n;

        if(dp[n]!=0)
        return dp[n];

        return (dp[n]=fib(n-1,dp)+fib(n-2,dp));
    }

    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int x=fib(n,dp);
        System.out.println(x);
    }
}
