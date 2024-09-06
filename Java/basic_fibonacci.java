//Examples of Dynamic Porgramming
// Fibonacci sequence
// Longest common subsequence
// Knapsack problem
// coin change problemshortest path in a weighted graph
// matrix chain multiplication
// edit distance

import java.util.*;
public class basic_fibonacci{
    public static int fibonacciBotttomUp(int n){
        if(n <= 1){
            return n;
        }
        int[] fibArray  = new int[n+1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for(int i = 2; i <= n; i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray[n];
    }

    public static void main(String[] args) {
        int n ;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int result = fibonacciBotttomUp(n);
        System.out.println("F(" + n + ") = " + result);
    }
}


//Dynamic Programming

// public class basic_fibonacci{
//     public static int fibDP(int x){
//         int fib[] = new int[x+1];
//         fib[0]= 0;
//         fib[1] = 1;
//         for(int i = 2; i < x+1; i++)
//         {fib[i] = fib[i-1] +fib[i-2];
//             System.out.print(fib[i]+ " ");
//         }
    
//     return fib[x];
//     }
//     public static void main(String[] args) {
//         System.out.println(fibDP(10));
//     }
//    }
   

