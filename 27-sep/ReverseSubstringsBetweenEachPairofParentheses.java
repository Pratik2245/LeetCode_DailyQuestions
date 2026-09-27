import java.util.Stack;

public class ReverseSubstringsBetweenEachPairofParentheses {
    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }

    public static String reverseParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(builder.toString());
                builder.setLength(0);

            } else if (ch == ')') {
                builder.reverse();
                String ans = stack.pop();
                builder.insert(0, ans);
            } else {
                builder.append(ch);
            }
            System.out.println(stack);
        }
        return builder.toString();
    }
}
