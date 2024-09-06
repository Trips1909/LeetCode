import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even number");
        }
        
        System.out.println("Outside if");
        sc.close();
    }
    
}
