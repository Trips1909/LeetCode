import java.util.*;
public class min_steps{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        int [] divs= new int[n];
        boolean flag;

        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();

        for(int i=0;i<n;i++)
        divs[i]=sc.nextInt();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<n;j++){
                if(nums[i]%divs[j]!=0){
                    
                }

            }
        }
        

    }
}
