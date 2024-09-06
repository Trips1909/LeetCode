import java.util.*;
public class vowelsremove{
public static void main(String[] args) {
    String s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    s = s.replaceAll("[aeiou]","");
    System.out.println(s);
}
}