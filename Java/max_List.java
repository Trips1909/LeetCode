import java.util.*;
public class max_List{
    public static List<Integer> mergeSortedLists(List<Integer>lst1,List<Integer> lst2){
        List<Integer> mergedList = new ArrayList<>();
        int i=0,j =0;
        while(i < lst1.size() && j < lst2.size()){
            if(lst1.get(i) < lst2.get(j)){
                mergedList.add(lst1.get(i++));
            }else{
                mergedList.add(lst2.get(j++));
            }
        }
        mergedList.addAll(lst1.subList(i,lst1.size()));
        mergedList.addAll(lst2.subList(j, lst2.size()));
        return mergedList;
    }
}