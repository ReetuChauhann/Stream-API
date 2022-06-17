import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Secondex {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> newlist= list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(newlist);

    }
    
}
