class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0;j<board[i].length; j++){
                
                if(word.charAt(0)==board[i][j] && search(i,j,0,word,board,used)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean search(int i, int j, int ind, String word, char[][] board, boolean[][] used){

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || used[i][j] || word.charAt(ind)!=board[i][j]){
            return false;
        }
        
        if(ind == word.length()-1){
            return true;
        }
        used[i][j] = true;
        if(search(i,j+1,ind+1,word,board,used) 
        || search(i,j-1,ind+1,word,board,used) 
        || search(i+1,j,ind+1,word,board,used) 
        || search(i-1,j,ind+1,word,board,used)){
            return true;
        }

        used[i][j] = false;
        return false;
    }
}