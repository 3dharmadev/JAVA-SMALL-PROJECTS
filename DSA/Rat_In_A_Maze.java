package DSA401;

public class Rat_In_A_Maze {
    public static int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][] flag=new boolean[n][m];
        int ans=0;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans=Math.max(ans, Sol(matrix,flag,i,j,dp));
                //  System.out.println();
            }
        }
        return ans;
    }


    public static  int Sol(int[][] arr,boolean[][] flag,int row,int col,int[][] dp){

        if(row<0 || col<0 || row>=arr.length || col>=arr[0].length || flag[row][col]){
            return 0;
        }

        if(dp[row][col]!=0){
            return dp[row][col];
        }
        int n=arr.length;
        int m=arr[0].length;
        int res=1;
        flag[row][col]=true;
        if(row+1<n && arr[row+1][col]>=arr[row][col]+1){

            res=Math.max(res,  1+Sol(arr,flag,row+1,col,dp));


        }
        if(col+1<m && arr[row][col+1]>=arr[row][col]+1){

            res= Math.max(res, 1+Sol(arr,flag,row,col+1,dp));

        }

        if(col-1>=0 && arr[row][col-1]>=arr[row][col]+1) {


            res = Math.max(res, 1+Sol(arr, flag, row, col - 1,dp));
        }

        if(row-1>=0 && arr[row-1][col]>=arr[row][col]+1){

            res = Math.max( res, 1+Sol(arr,flag,row-1,col,dp));

        }

        flag[row][col]=false;
        dp[row][col]=res;
        return res;
    }
    public static void main(String[] args) {
        int[][] arr={{9 ,9, 4},
                {6, 6, 8},
                {2 ,1 ,1}};
        System.out.print(   longestIncreasingPath(arr));
    }
}
