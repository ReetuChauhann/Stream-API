import java.util.stream.Collectors;
import java.util.*;

public class map {
     public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> strm=list1.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(strm);


     }
    
}
