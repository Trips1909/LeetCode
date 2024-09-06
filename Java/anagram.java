import java.util.*;
public class anagram {
    public static boolean isAnagram(String s1,String s2){
        s1.replaceAll("\\s","");
        s1.replaceAll("\\s", "");

        if(s1.length()!= s2.length()){
        return false;
        }
        else{
            char c1[]= s1.toLowerCase().toCharArray();
            char c2[] = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        boolean b = isAnagram(s1,s2);
        System.out.println(b);
    }
}
