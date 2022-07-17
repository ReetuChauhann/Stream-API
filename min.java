import java.util.List;

public class min {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6);

        Integer integer =list.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(integer);
    }
    
}
