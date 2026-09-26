// package 26-sep;

import java.util.HashMap;
import java.util.List;

public class EvaluateTheBracketPairsOfAString {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        List<List<String>> knowledge = List.of(
                List.of("name", "bob"),
                List.of("age", "two"));
        String ans = evaluate(s, knowledge);
        System.out.println(ans);
    }

    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        // StringBuilder builder = new StringBuilder();
        // int i = 0;
        // while (i < s.length()) {
        // if (s.charAt(i) == '(') {
        // int j = i + 1;
        // while (s.charAt(j) != ')') {
        // j++;
        // }
        // String key = s.substring(i + 1, j);
        // if (map.containsKey(key)) {
        // builder.append(map.get(key));
        // } else {
        // builder.append("?");
        // }
        // i = j + 1;
        // } else {
        // builder.append(s.charAt(i));
        // i++;
        // }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int closingBracketIdx = s.indexOf(')', i + 1);

                String key = s.substring(i + 1, closingBracketIdx);
                builder.append(map.getOrDefault(key, "?"));

                i = closingBracketIdx;

            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
