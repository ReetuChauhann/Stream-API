import java.util.*;
import java.util.stream.Collectors;
public class methods {
    public static void main(String[] args) {
    //sort the list
        // List<Integer> list=List.of(1,4,6,7,2);
        // List<Integer> newlist=list.stream().sorted().collect(Collectors.toList());
        // System.out.println(newlist);

// find the minimum element
        // List<Integer> list=List.of(2,3,5,6,7,8,9);
        // Integer newlist=list.stream().min((x,y) -> x.compareTo(y)).get();
        // System.out.println(newlist);
        
//find the maximum element
List<Integer> list=List.of(2,3,5,6,7,8,9);
 Integer newlist=list.stream().max((x,y) -> x.compareTo(y)).get();
 System.out.println(newlist);
         
    }
}
