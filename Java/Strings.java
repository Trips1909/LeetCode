//Methods in strings
public class Strings {
    public static void main(String[] args) {
        // //1. By directly initializing the string 
        String str = "Coding Ninjas";

        // //Using new Literal
        // //1. Using String literal
        // String str2 = new String("Coding Ninjas");
        // //2. passing character array
        // char ch[] = {'c','o','d','i','i','n','g'};
        // String str3 = new String(ch);

        // //3. Passing Byte Array which represents ASCII values of characters(0-255)
        // byte b[]= {98,99,100,101,102};

        // String str4 = new String(b);

        // System.out.println(str);
        // System.out.println(str2);
        // System.out.println(str3);
        // System.out.println(str4);

        // System.out.println(str.trim());
        // System.out.println(str.substring(10,13));
        // System.out.println(str.replace('n','@' ));

        // System.out.println(str.indexOf("o"));
        // System.out.println(str.lastIndexOf('n'));

        String s1 = "Hllo";
        String s2 ="hllo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
    
}
