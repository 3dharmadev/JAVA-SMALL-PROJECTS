package DSA501;

import java.util.Arrays;

public class Fibonacci {
    public static int FibMemoized(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        int fibn1 = FibMemoized(n - 1, qb);
        int fibn2 = FibMemoized(n - 2, qb);
        int fibn = fibn1 + fibn2;

        qb[n] = fibn;


        return fibn;
    }
    public static void main(String[] args) {
       int N=5;
        int[] qb = new int[N+ 1];
        System.out.println(FibMemoized(N,qb));
    }
}
