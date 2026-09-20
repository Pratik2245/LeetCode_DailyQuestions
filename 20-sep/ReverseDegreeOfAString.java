
public class ReverseDegreeOfAString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }

    public static int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = 'z' - s.charAt(i) + 1;
            int ans1 = num * (i + 1);
            res += ans1;
        }
        return res;
    }
}
