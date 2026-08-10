class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i == j) ans += mat[i][j];
                else if(j == (mat.length-1-i)) ans+= mat[i][j];
            }
        }
        //if(mat.length)
        return ans;
    }
}