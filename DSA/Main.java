package DSA401;

import java.util.*;
import java.io.*;

public class Main{

    public static void display(int N){
        int []dp = new int[N + 1];
        for (int i = 0; i <= N; i++) dp[i] = (int) Math.pow(10, 9);
        dp[0] = 0;


        for (int i = 0; i <= N; i++)
        {

            for (char c : String.valueOf(i).toCharArray())
            {

                dp[i] = Math.min(dp[i], dp[i - (c - '0')] + 1);
            }
        }
        System.out.println(dp[N]);

    }
    public static void main(String[] args) {
        display(20);
    }
}