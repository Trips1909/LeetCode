import java.util.*;
public class subset_sum {
    private static Boolean[][] subsetSumMem;
    public static boolean subsetsum(int []values,int targetSum,int n){
        if(targetSum == 0)
        return true;

        if(n==0)
        return false;

        if(subsetSumMem[targetSum][n]!= null ){
            return subsetSumMem[targetSum][n];
        }
        if(values[n-1] > targetSum){
            subsetSumMem[targetSum][n] = hasSubsetSumRecur(values,targetSum, n-1);
    
        }
        else{
            subsetSumMem[targetSum][n] = hasSubsetSumRecur(values,targetSum -values[n-1], n-1) || hasSubsetSumRecur(values,targetSum,n-1);
        }
        return subsetSumMem[targetSum][n];
    }

    private static boolean hasSubsetSumRecur(int[] values,int targetSum,int n)
    {
        subsetSumMem = new Boolean[targetSum +1][n+1];
        for(int s =0; s <=targetSum ; s++){
            for(int i =0;i<=n; i++){
                subsetSumMem[s][i] =null;
            }
        }
        return hasSubsetSumRecur(values, targetSum, n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
int[]values = new int[n];
for(int i =0; i< n;i++)
{
    values[i] = sc.nextInt();
}
int target = sc.nextInt();
System.out.println("Has Subset sum : "+ hasSubsetSumRecur(values, target, n));
    }
}
