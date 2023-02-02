package DSA501;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class NumberOfFact {

    public static void display(int N){
        PrintWriter out = new PrintWriter(System.out);

        Integer [] fact=new Integer[14];

        ArrayList<Integer> ans=new  ArrayList<Integer>();
        fact[0]=1;
        for(int i=1;i<10;i++) {
            fact[i]=fact[i-1]*i;
        }

        Arrays.sort(fact);
        reverse(fact);
        System.out.println(Arrays.toString(fact));
        for(int i=9;i>=0;i--){
            while(fact[i]<=N){
                N-=fact[i];
                ans.add(i);
            }
        }

        out.println(ans.size());
        out.flush();

    }
    public static void main(String [] args) throws NullPointerException {


        display(10);

    }


    }