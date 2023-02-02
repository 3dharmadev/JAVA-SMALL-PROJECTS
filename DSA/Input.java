package DSA501;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Input {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }



    public static void main(String[] args) throws IOException {
        FastReader br = new FastReader();



        String sc=br.nextLine();
        int tc = Integer.parseInt(sc);


        long[] arr1= Stream.of(br.nextLine().split(" ")).
                mapToLong(Long::parseLong).sorted().toArray();


        int[] arr2= Stream.of(br.nextLine().split(" ")).
                mapToInt(Integer::parseInt).sorted().toArray();

       System.out.println(Arrays.toString(arr2));


    }
}
