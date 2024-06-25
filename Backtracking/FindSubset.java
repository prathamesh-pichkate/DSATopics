public class FindSubset {
    public static void findSubset(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans+" ");
            }
            return;
        }

        findSubset(str, ans+str.charAt(i), i+1); //YES condition
        findSubset(str, ans, i+1);  //NO condition
    }
    public static void main(String[] args) {
        String str = "abc";  //Total Subset : 2^str.lenght()
        findSubset(str, "", 0);
    }
}
