public class palindrome {
    static int reverse(int n){
        int reveresed_n =0;
        while(n >0){
            reveresed_n = reveresed_n*10+ n%10;
            n = n/10;
        }
        return reveresed_n;
    }
    public static void main(String[] args) {
        int n =1234578;
        System.out.println(reverse(n));
    }
}
