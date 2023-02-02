package java111.sprint_3;

import java.util.Scanner;

class EvenSumCol{
    public static void findTheEvenSum(int[][] input){

       int rows = input.length;
       int cols = input[0].length;
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
          if(input[j][i]%2==0)  sum += input[j][i];
            }
        System.out.println(sum);
        }

   }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
          int  m = sc.nextInt();
            System.out.println("Enter the number of columns");
          int  n = sc.nextInt();

            int matrix[][] = new int[m][n];

            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();


        findTheEvenSum(matrix);
             sc.close();
    }
}
