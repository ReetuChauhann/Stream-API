import java.util.List;
import java.util.stream.Collectors;

public class fourthex {
    public static void main(String[] args) {
        List<String> names=List.of("Reetu", "Naman", "Vipul", "Rahul");
        List<String> newnames=names.stream().filter(i -> i.startsWith("R")).collect(Collectors.toList());
        System.out.println(newnames);
    }
}
