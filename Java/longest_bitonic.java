public class longest_bitonic {
    public static int calculateLBS(int[] nums){
        int n = nums.length;

        if(n ==0 ){
            return 0;
        }

        int[] I = new int[n];
        int[]D= new int [n];

        I[0]= 1;
        for(int i =1; i< n; i++){
            for(int j= 0; j< i;j++){
                if(nums[j] < nums[i] && I[j] > I[i]){
                    I[i] = I[j];
                }
            } 
            I[i]++;
        }
        D[n-1] = 1;
    for(int i =n-2; i>=0 ; i--)
    {
        for(int j= n-2; j >i; j--){
            if(nums[j] < nums[i] && D[j] > D[i]){
                D[i] = D[j];
            }
        }
        D[i]++;
    } 
     
    int lbs =1;
    for(int i =0; i < n;i++){
        lbs = Integer.max(lbs,I[i] +D[i] -1);
    }
    return lbs;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,6,10,3,1};
        System.out.println(calculateLBS(nums));
    }
   
}
