//Que : Write a program to FindTranspose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix

// Matrix 1:
// a11    a12    a13
// a21    a22    a23

// Transpose :
//a11    a21
//a12    a22
//a13    a23


public class Transpose {
    public static void transpose(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;

        int transpose[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        print(transpose);
    }

    public static void print(int transpose[][]){
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      int matrix[][]={{1,2,3},{4,5,6}};
      transpose(matrix);
      
    }
}
