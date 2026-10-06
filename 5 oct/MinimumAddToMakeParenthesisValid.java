
public class MinimumAddToMakeParenthesisValid {
    public static void main(String[] args) {
        String s = ")(";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        int opened = 0, added = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                opened++;
            } else if (opened > 0) {
                opened--;
            } else {
                added++;
            }
        }
        return added + opened;
    }
}
