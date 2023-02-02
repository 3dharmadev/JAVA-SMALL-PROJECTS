package DSA401;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BigInterger {

    public static int display(int k,List<Integer> list){
        // System.out.println(Arrays.toString(arr));
        if(k<0) return 0;
        if(k==0) return 1;

        int count =0;
        for(int i=0;i<list.size();i++){
            count+=  display( k-list.get(i),list);
        }
        return count;
    }
    public static void main(String[] args) {
      //  BigInteger st=new BigInteger("199999999999999999999922222222888874474774744747");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(list.size()-1);
        //System.out.println(display( 3,list));

        String arr_str="1 2 3 4 5 6 7 8 9 0";
int max=Integer.MAX_VALUE;
int min =Integer.MIN_VALUE;
        System.out.println(max+" "+min);
         List<Integer> arr = Arrays.stream(arr_str.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

       // System.out.println(ints);
    }
}
