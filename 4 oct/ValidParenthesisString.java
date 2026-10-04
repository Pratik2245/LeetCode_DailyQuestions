package 4 oct;

public class ValidParenthesisString {
    public static void main(String[] args) {
        String s="(*)";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int minOpen=0;
        int maxOpen=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                minOpen++;
                maxOpen++;
            }else if(ch==')'){
                 minOpen--;
                 maxOpen--;
            }else{
                 minOpen--;
                 maxOpen++;
            }
            if(maxOpen<0){
                return false;
            }
            minOpen = Math.max(0, minOpen);
        }
        return minOpen==0;

    }
}
