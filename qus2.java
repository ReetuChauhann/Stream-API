import java.util.*;

//common elements from 2 array
public class qus2 {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,6,8};
        int[] a2={7,6,5,8,9};
       List<Integer> ans= common(a1,a2);
       System.out.println(ans);
    }

    public static List<Integer> common(int[] a1, int[] a2){
        List<Integer> l=new ArrayList<>();
        for(int i=0; i<a1.length; i++){

            for(int j=0; j<a2.length; j++){
                if(a1[i]==a2[j])
                       l.add(a1[i]);

            }
        }
        return l;
    }
    
}
