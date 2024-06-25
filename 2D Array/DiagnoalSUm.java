public class DiagnoalSUm {
    public static int sum(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=matrix[i][i] + matrix[n-i-1][i];
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(sum(matrix));
    }
}
