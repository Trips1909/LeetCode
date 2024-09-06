import java.util.*;
public class count_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char c[] =str.toCharArray();
        int l = c.length;
        int count =0;
        
        for(int i =0 ; i < l; i++){
            if(c[i] == ' ' || i == l-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
