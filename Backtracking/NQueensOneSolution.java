public class NQueensOneSolution {

    public static boolean isSafe(char board[][],int row,int col){

        //vertical check:
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagnol-left:
        for(int i=row-1 ,j=col-1; i>=0 && j>=0 ;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagnol-right:
        for(int i=row-1,j=col+1;i>=0 && j<=board.length-1;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][],int row){
        if(row == board.length){ 
            // print(board);
            return true;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                } // function call
                board[row][col] = 'x';  //backtracking
            }
        }
        return false;
    }

    public static void print(char board[][]){
        System.out.println("-----------chess board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            print(board);
        }else{
            System.out.println("Solution is not possible");
        }
       
    }
}
