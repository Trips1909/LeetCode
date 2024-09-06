// public class twoitems {
//     //just using brute force approach
//     static boolean checkcount(int arr[],int n,int k){
//         int count;
//         //start traversing for elements
//         for(int i = 0; i < n;i++)
//         {   
//             count = 0;
//             //count occurances of current element
//             for(int j = 0; j < n; j++)
//             {
            
//             if(arr[j]== arr[i])
//             count++;

//             if(count > 2*k)
//             return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         int arr[]={1,1,1,1,1,3,4};
//         int len = arr.length;
//         int k = 2;
//         System.out.println(checkcount(arr,len,k));
//     }
    
// }
import java.util.HashMap;
import java.util.Map;
class twoitems{
     static boolean checkcount(int arr[],int n, int k){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(!hash.containsKey(arr[i]))
            hash.put(arr[i],0);

            hash.put(arr[i],hash.get(arr[i]) + 1);
        }
        //check for each value in the Hash Map
        for(Map.Entry x: hash.entrySet())
        {
         if((int)x.getValue() > 2*k)
         return false;   
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}
