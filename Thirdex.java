import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Thirdex {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(11);
        list.add(6);
        list.add(85);
        list.add(65);
        list.add(7);
        list.add(5);
        list.add(4);

        List<Integer> newlist=list.stream().filter(i -> i>10).collect(Collectors.toList());
        System.out.println(newlist);

    }
}
