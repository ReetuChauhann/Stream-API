import java.util.*;
import java.util.stream.Collectors;

public class qus {
     public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,5,6,6,6,7,8};

        Set<Integer> set1=new HashSet<>();
        for (int a : arr) {
            set1.add(a);
            
        }

        Iterator i=set1.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }


     }
    
}
