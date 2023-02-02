package DSA501;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Compa {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void display(int N,int [] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String [] args) throws Exception{

       int[] intArr={3,25,70,56,46,0,1};

        quickSort(intArr,0,intArr.length-1);

        for(int i:intArr){
            System.out.print(i+" ");
        }
    }
}

