import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // here you may use the stack approach to solve the problem in that to push the 
        // brackets into the stack and check weather it is avaliable on the top or not
        // if the character is present on the top of the stack return true else false.
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);   //Pushing into the stack...
            } else {

                if (stack.isEmpty()) {
                    return false;  // if the stack is empty means return false
                }
// checking the condition into this make sure about the element should be present in order..
                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}