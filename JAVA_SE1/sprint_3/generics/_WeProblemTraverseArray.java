package java111.sprint_3.generics;

public class _WeProblemTraverseArray {
    public static void main(String[] args) {
        String[] str = {"one","two"};
        Integer[] integers={1,2,4,5,6};
        traverse(str);
        traverse(integers);
    }
    static <T> void traverse(T[] array){
        for (T arr: array) {
            System.out.println(arr);
        }
    }

}

