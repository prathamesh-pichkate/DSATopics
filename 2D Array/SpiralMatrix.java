public class SpiralMatrix {
    public static void spiralMat(int matrix[][],int n,int m){
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=m-1;

        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+","+"");
            }
    
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+","+"");
            }
    
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){ //if mid condition occurs
                    break;
                }
                System.out.print(matrix[endRow][i]+","+"");
            }
    
            for(int j=endRow-1;j>=startRow+1;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.println(matrix[j][startCol]+","+"");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4},
        //                  {5,6,7,8},
        //                  {9,10,11,12},
        //                  {13,14,15,16}};

        int matrix[][]={{1,2,3},
                         {5,6,7},
                         {9,10,11}};
                        
        int n=matrix.length;
        int m=matrix[0].length;
        spiralMat(matrix,n,m);
    }
}
