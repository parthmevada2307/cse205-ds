class Solution {
    public void func1(int i,int j,int len1,int len2,char board[][]){
        if(i<0 || j<0 || i>=len1 || j>=len2 || board[i][j]!='O'){
            return;
        }
        board[i][j]='*';
        func1(i-1,j,len1,len2,board);
        func1(i+1,j,len1,len2,board);
        func1(i,j-1,len1,len2,board);
        func1(i,j+1,len1,len2,board); 
      

    }
    public void solve(char[][] board) {
        int len1=board.length;
        int len2 =board[0].length;

        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(i*j==0 || i==len1-1 || j==len2-1 ){
                    if(board[i][j]=='O'){
                        func1(i,j,len1,len2,board);
                    }
                }
                
            }
        
        }
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(board[i][j]=='O')
                board[i][j]='X';
                if(board[i][j]=='*')
                board[i][j]='O';
            }
        }

    }
}