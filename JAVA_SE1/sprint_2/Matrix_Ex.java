package java111.sprint_2;

public class Matrix_Ex {
    public static void main(String[] args) {
        int[][] mat =new int[3][3];
        /*for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println(mat[i][j]);
            }
        }*/
        /*int [][] a={
                {1,2,3},
                {4,5,6,9},
                {7},
        };

        int R=a.length;
        for (int i=0;i<R;i++){
            int C=a[i].length;
            for (int j=0;j<C;j++){
                System.out.print(a[i][j]);
            }
             System.out.println();
        }*/
       // System.out.println(args[1]);
        //Converting a String to Integer or Double
      Integer x=  Integer.parseInt("121");
        System.out.println(x);
        Double d=Double.parseDouble("1892.338");
        System.out.println(d);

        Integer n=10;
       String str=String.valueOf(n);
        System.out.println(str);

    }
}
