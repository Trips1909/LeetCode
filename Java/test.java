
import java.util.*;
public class test{
    //Reverse a string
    public static void main(String[] args) {
        
    String s,nstr="";
    char ch;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();

    for(int i = 0; i < s.length();i++){
        ch = s.charAt(i);
        nstr= ch+nstr; //add each character in front of existing string
    }

    System.out.println(nstr);
  }
}
