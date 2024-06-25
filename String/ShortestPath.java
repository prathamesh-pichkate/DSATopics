public class ShortestPath {
    public static float shortPath(String str){
        int n=str.length();
        int x=0;
        int y=0;

        for(int i=0;i<n;i++){
        char dir = str.charAt(i);

        //South:
        if(dir=='S'){
            y--;
        }
        else if(dir=='N'){
            y++;
        }
        else if(dir=='E'){
            x++;
        }
        else{
           x--;
        }
    }
     int X2=x*x;
     int Y2=y*y;

     return (float)Math.sqrt(X2 +Y2);

    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortPath(str));
    }
}
