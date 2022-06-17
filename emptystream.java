import java.util.stream.Stream;

public class emptystream {
    public static void main(String[] args) {
        Stream<Object> emptystream=Stream.empty();
        emptystream.forEach(e -> {System.out.println(e);});

    }
}
