import java.util.*;

public class qus3 {

    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={4,5,6,7,8};
        common(a1,a2);
    }
     public static void common(int[] a1, int[] a2){
           Set<Integer> set1=new HashSet<>();
           Set<Integer> set2=new HashSet<>();

           for (int i : a1) {
            set1.add(i);
         }

     for(int j : a2){
            set2.add(j);
         }

     set1.retainAll(set2);
     System.out.print(set1 + " ");


     }
    
}
