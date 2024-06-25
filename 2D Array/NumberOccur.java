//Que: Print the number of 7’s that are inthe 2d array.
//Example :
//Input - int[][] array = { {4,7,8},{8,8,7} };
//Output - 2


public class NumberOccur {
    public static int occur(int matrix[][],int n,int m,int key){
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                     total++;
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                         {8,8,7}};
        int n=matrix.length;
        int m=matrix[0].length;
        int key=8;

        System.out.println(occur(matrix,n,m,key));
    }
}
