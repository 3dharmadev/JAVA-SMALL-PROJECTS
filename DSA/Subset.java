package DSA501;

import java.util.List;

public class Subset {
    public static boolean display(int N, List<Integer> list, int K){
        if(K==0) return true;
        if(N==0) return false;

        if(list.get(N-1)>K) display(N-1,list,K);

        return display(N-1,list,K) || display(N-1,list,K-list.get(N-1));
    }

    public static void main(String[] args) {

    }
}
