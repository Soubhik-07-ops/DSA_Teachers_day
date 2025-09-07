import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        int n = s.length();
        Stack<Character> stack = new Stack<>();

        if (n % 2 != 0) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return (stack.size() == 0);
    }
}