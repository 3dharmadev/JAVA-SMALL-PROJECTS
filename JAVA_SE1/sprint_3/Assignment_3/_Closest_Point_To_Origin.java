package java111.sprint_3.Assignment_3;

import java.util.*;

public class _Closest_Point_To_Origin {

    public static int[][] closest_point(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>(new customClosestPointComparator());

        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int[][] res = new int[k][2];

        int i = 0;
        while ((!pq.isEmpty())) {
            res[i] = pq.remove();
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] matrix = closest_point(points, k);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("["+matrix[i][j] + "]");
            }
            System.out.println();
        }


    }
}
class    customClosestPointComparator implements Comparator<int[]>{

    @Override
    public int compare(int[] p1, int[] p2){

       // System.out.println(Arrays.toString(p1)+"  "+Arrays.toString(p2));
        return p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1];
    }
}