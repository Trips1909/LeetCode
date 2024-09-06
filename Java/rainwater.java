import java.util.*;
public class rainwater {
    static int trap(int[] arr,int n){
        
        int res=0;
        int left[]= new int[n];
        int right[]= new int[n];

        for(int i=1; i<n ; i++){
            left[i]=Math.max(left[i -1],arr[i]);
        
        right[n-1] = arr[n-1];

        for(int j= n-2 ; j>=0;j-- )
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }

        for(int j= n-2 ; j>=0;j-- )
        {
            res+=Math.max(left[i],right[i]-arr[i]);
        }

    }
        return res;
    }

    public static void main(String args[]){
        int arr[]={ 0,1,0,2,1,0,3,2,1,2,1};
        int n =arr.length;

        System.out.println(trap(arr,n));
    }
}
