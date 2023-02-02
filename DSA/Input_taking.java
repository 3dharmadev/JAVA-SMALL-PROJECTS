package DSA401;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Input_taking {
    static boolean bool=false;
//    public static void display(List<Integer> new_arr,List<Integer> arr,int index){
//        if (new_arr.size() == 0)System.out.println("Empty!");
//        else{
//            System.out.println(new_arr);
//        }
//        if(index == arr.size()){
//            return;
//        }
//        for (int i = index;i<arr.size();i++){
//            new_arr.add(arr.get(i));
//            display(new_arr,arr,i+1);
//            new_arr.remove(new_arr.size()-1);
//        }
//    }


       static  List<List<Integer>> combs = new ArrayList<List<Integer>>();


    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
        }
    }
    public static void main(String[] args) throws IOException {
//        java.util.List<Integer> list= new ArrayList<>();
//        java.util.List<Integer> list1= Arrays.asList(1,2,3);
//       display(list,list1,0);
//        String sss="1 2 33";
//        int[] intArr= Stream.of(sss.split(" ")).mapToInt(Integer::parseInt).toArray();
//        System.out.println(Arrays.toString(intArr));

        combine(combs, new ArrayList<Integer>(), 1, 4, 2);

        System.out.println(combs);

    }




}
