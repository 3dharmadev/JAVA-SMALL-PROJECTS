package DSA501;

import java.util.Arrays;
import java.util.List;

public class SubsetKsum {
    public static boolean display(int N, List<Integer> list, int K){
        if(K==0) return true;
        if(N==0) return false;

        if(list.get(N-1)>K) display(N-1,list,K);

        return display(N-1,list,K) || display(N-1,list,K-list.get(N-1));
    }

    public static void main(String[] args) {
         List<Integer> list= Arrays.asList( 3, 34, 4, 12, 5, 2 );

         display(list.size(),list,9);
    }
}
