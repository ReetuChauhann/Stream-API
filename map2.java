import java.util.*;
import java.util.stream.Collectors;

public class map2 {
     public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        List<Integer> list2=list.stream().map( i -> i*i*i).collect(Collectors.toList());
        System.out.println(list2);
     }
    
}
