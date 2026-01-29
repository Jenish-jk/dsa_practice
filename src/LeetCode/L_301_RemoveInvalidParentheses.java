package LeetCode;

import java.util.*;

public class L_301_RemoveInvalidParentheses {

    public static void main(String[] args) {
        String s = "()())()";
        System.out.println(removeInvalidParentheses(s));
    }

    public static List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (isValid(current)) {
                result.add(current);
                found = true;
            }

            if (found) continue;

            for (int i = 0; i < current.length(); i++) {
                char c = current.charAt(i);

                if (c != '(' && c != ')') continue;

                String next = current.substring(0, i) + current.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.offer(next);
                }
            }
        }

        return result;
    }

    private static boolean isValid(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') {
                count--;
                if (count < 0) return false;
            }
        }

        return count == 0;
    }
}
