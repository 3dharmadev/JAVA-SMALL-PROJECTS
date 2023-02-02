package java111.sprint_2;

import java.sql.Array;
import java.util.Arrays;

public class array_lecture {
    public static void main(String[] args) {
//           int[] arr=new int[5];
      //  System.out.println(arr);
//        for (Integer i: arr) {
//            System.out.println(i);
//        }
        Double[] array={1.4,1.2,1.5,2.232};
       Double[] arr= doubleArray(array);
        System.out.println(Arrays.toString(arr));
        Double[] copyArr=Arrays.copyOf(array,4);
        System.out.println(Arrays.toString(copyArr));
    Arrays.sort(copyArr);
        System.out.println(Arrays.toString(copyArr));
    }

     static Double[] doubleArray(Double[] array){
        Double [] newArray= new Double[array.length];
        for (int i=0;i< array.length;i++){
            newArray[i]=array[i]*2;
        }
        return  newArray;
     }

}
