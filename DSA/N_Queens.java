package DSA401;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_Queens {
    static int count=0;
    public static void nQueens(int[][]board,int row){
        // base case
        if (row == board.length){
            // for(int[] i:board){
            //     System.out.println(Arrays.toString(i));
            // }
            count++;
            return;
        }
        for (int i = 0;i<board.length;i++){
            if (checkSafe(board,row,i)){
                // System.out.println(row);
                board[row][i] = 1;
                nQueens(board,row+1);
                board[row][i] = 0;
            }
        }
    }

    public static boolean checkSafe(int[][]board,int row,int col){
        for (int i = row-1;i>=0;i--){
            if (board[i][col] == 1) return false;
        }
        for (int i = row-1,j = col-1;i>=0 && j >=0;i--,j--){
            if (board[i][j] == 1) return false;
        }
        for (int i = row-1,j = col+1;i>=0 && j < board.length;i--,j++){
            if (board[i][j] == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        int [][] mat = new int[4][4];
//        nQueens(mat,0);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
    }
}
