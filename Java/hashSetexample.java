import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashSetexample {
    public static void main(String[] args) {
        
    Set<String> Set1 = new HashSet<>();
    Set<String> Set2 = new HashSet<>();

    Set1.add("Delhi");
    Set1.add("Mumbai");
    Set1.add("Vellore");

    Set2.add("Vellore");
    Set2.add("delhi");
    Set2.add("Mumbai");

    Set<String> UnionSet = new HashSet<>(Set1);
    UnionSet.addAll(Set2);

    Set<String> IntersectionSet = new HashSet<>(Set1);
    IntersectionSet.retainAll(Set2);

    Set<String> DifferenceSet = new HashSet<>(Set1);
    DifferenceSet.removeAll(Set2);

    System.out.println("union set: ----");
    for(String element : UnionSet)
    System.out.println(element);

    System.out.println("intersection set: ----");
    for(String element : IntersectionSet) 
    System.out.println(element);

    System.out.println("difference set: ----");
    for(String element: DifferenceSet)
    System.out.println(element);
    }
}
